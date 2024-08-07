package com.hang.hoj.judge.codesandbox;

import com.hang.hoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.hang.hoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
