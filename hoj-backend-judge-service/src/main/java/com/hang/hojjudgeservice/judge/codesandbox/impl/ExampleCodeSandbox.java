package com.hang.hojjudgeservice.judge.codesandbox.impl;




import com.hang.hojjudgeservice.judge.codesandbox.CodeSandbox;
import com.hang.hojmodel.model.codesandbox.ExecuteCodeRequest;
import com.hang.hojmodel.model.codesandbox.ExecuteCodeResponse;
import com.hang.hojmodel.model.codesandbox.JudgeInfo;
import com.hang.hojmodel.model.enums.JudgeInfoMessageEnum;
import com.hang.hojmodel.model.enums.QuestionSubmitStatusEnum;

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
