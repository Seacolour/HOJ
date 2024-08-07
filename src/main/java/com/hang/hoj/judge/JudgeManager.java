package com.hang.hoj.judge;

import com.hang.hoj.judge.strategy.DefaultJudgeStrategy;
import com.hang.hoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.hang.hoj.judge.strategy.JudgeContext;
import com.hang.hoj.judge.strategy.JudgeStrategy;
import com.hang.hoj.judge.codesandbox.model.JudgeInfo;
import com.hang.hoj.model.entity.QuestionSubmit;
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
