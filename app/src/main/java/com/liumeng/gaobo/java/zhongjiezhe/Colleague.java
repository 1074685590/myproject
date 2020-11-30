package com.liumeng.gaobo.java.zhongjiezhe;

public abstract class Colleague {
    public Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}