package com.hang.hojjudgeservice.judge;


import com.hang.hojjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.hang.hojjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.hang.hojjudgeservice.judge.strategy.JudgeContext;
import com.hang.hojjudgeservice.judge.strategy.JudgeStrategy;
import com.hang.hojmodel.model.codesandbox.JudgeInfo;
import com.hang.hojmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if (language.equals("java")) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
