package com.hang.hoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hang.hoj.model.dto.question.QuestionQueryRequest;
import com.hang.hoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.hang.hoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.hang.hoj.model.entity.Question;
import com.hang.hoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hang.hoj.model.entity.User;
import com.hang.hoj.model.vo.QuestionSubmitVO;
import com.hang.hoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author guo
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-07-14 20:48:39
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交信息
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);
    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);


}
