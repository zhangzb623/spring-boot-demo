package com.xkcoding.helloworld.temp;

public abstract class BaseOperationTemplate {
    // 模板方法，定义通用流程
    public final void execute() {
        preProcess();
        process();
        postProcess();
    }

    // 预处理步骤
    protected abstract void preProcess();

    // 核心业务逻辑
    protected abstract void process();

    // 后处理步骤
    protected abstract void postProcess();
}
