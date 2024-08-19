package com.hang.hojjudgeservice.judge.codesandbox.impl;


import com.hang.hojjudgeservice.judge.codesandbox.CodeSandbox;
import com.hang.hojmodel.model.codesandbox.ExecuteCodeRequest;
import com.hang.hojmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
