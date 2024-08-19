package com.hang.hojjudgeservice.judge;


import com.hang.hojmodel.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
