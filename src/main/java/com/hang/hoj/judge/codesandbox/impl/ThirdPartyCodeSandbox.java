package com.hang.hoj.judge.codesandbox.impl;


import com.hang.hoj.judge.codesandbox.CodeSandbox;
import com.hang.hoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.hang.hoj.judge.codesandbox.model.ExecuteCodeResponse;

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
