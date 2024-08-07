package com.hang.hoj.judge;

import com.hang.hoj.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
