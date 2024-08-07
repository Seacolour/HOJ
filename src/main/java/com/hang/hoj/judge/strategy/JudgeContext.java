package com.hang.hoj.judge.strategy;

import com.hang.hoj.model.dto.question.JudgeCase;
import com.hang.hoj.judge.codesandbox.model.JudgeInfo;
import com.hang.hoj.model.entity.Question;
import com.hang.hoj.model.entity.QuestionSubmit;
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
