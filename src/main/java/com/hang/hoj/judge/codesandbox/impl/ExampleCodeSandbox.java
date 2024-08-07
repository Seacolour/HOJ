package com.hang.hoj.judge.codesandbox.impl;


import com.hang.hoj.judge.codesandbox.CodeSandbox;
import com.hang.hoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.hang.hoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.hang.hoj.judge.codesandbox.model.JudgeInfo;
import com.hang.hoj.model.enums.JudgeInfoMessageEnum;
import com.hang.hoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试代码沙箱");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
