package com.luots.lojcodesandbox;

import com.luots.lojcodesandbox.model.ExecuteCodeRequest;
import com.luots.lojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
