package com.hang.hoj.service;

import com.hang.hoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.hang.hoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hang.hoj.model.entity.User;

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


}
