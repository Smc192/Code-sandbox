package com.luots.lojcodesandbox;

import com.luots.lojcodesandbox.model.ExecuteCodeRequest;
import com.luots.lojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
