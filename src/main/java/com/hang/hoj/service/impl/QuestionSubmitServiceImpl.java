package com.hang.hoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hang.hoj.common.ErrorCode;
import com.hang.hoj.exception.BusinessException;
import com.hang.hoj.mapper.QuestionSubmitMapper;
import com.hang.hoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.hang.hoj.model.entity.Question;
import com.hang.hoj.model.entity.QuestionSubmit;
import com.hang.hoj.model.entity.User;
import com.hang.hoj.model.enums.QuestionSubmitLanguageEnum;
import com.hang.hoj.model.enums.QuestionSubmitStatusEnum;
import com.hang.hoj.service.QuestionService;
import com.hang.hoj.service.QuestionSubmitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author guo
 * @description 针对表【question_submit(题目提交)】的数据库操作Service实现
 * @createDate 2024-07-14 20:48:39
 */
@Service
public class QuestionSubmitServiceImpl extends ServiceImpl<QuestionSubmitMapper, QuestionSubmit>
        implements QuestionSubmitService {
    @Resource
    private QuestionService questionService;

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    @Override
    public long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser) {
        //编程语言是否合法
        String language = questionSubmitAddRequest.getLanguage();
        QuestionSubmitLanguageEnum languageEnum = QuestionSubmitLanguageEnum.getEnumByValue(language);
        if (languageEnum == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "编程语言错误");
        }
        Long questionId = questionSubmitAddRequest.getQuestionId();
        // 判断实体是否存在，根据类别获取实体
        Question question = questionService.getById(questionId);
        if (question == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }
        // 是否已题目提交
        long userId = loginUser.getId();
        // 每个用户串行题目提交
        // 锁必须要包裹住事务方法
        QuestionSubmit questionSubmit = new QuestionSubmit();
        questionSubmit.setUserId(userId);
        questionSubmit.setQuestionId(questionId);
        questionSubmit.setCode(questionSubmitAddRequest.getCode());
        questionSubmit.setLanguage(language);
        // 设置初始状态
        questionSubmit.setStatus(QuestionSubmitStatusEnum.WAITING.getValue());
        questionSubmit.setJudgeInfo("{}");

        boolean save = this.save(questionSubmit);
        if (!save) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "题目提交失败");
        }
        return questionSubmit.getId();

    }

}




