package com.hang.hojjudgeservice.judge.codesandbox;


import com.hang.hojmodel.model.codesandbox.ExecuteCodeRequest;
import com.hang.hojmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
