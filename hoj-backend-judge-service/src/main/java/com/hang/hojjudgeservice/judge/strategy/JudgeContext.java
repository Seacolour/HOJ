package com.hang.hojjudgeservice.judge.strategy;


import com.hang.hojmodel.model.codesandbox.JudgeInfo;
import com.hang.hojmodel.model.dto.question.JudgeCase;
import com.hang.hojmodel.model.entity.Question;
import com.hang.hojmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中要传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
