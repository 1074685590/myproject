package com.liumeng.gaobo.java.others;
public class Lawyer implements ILawsuit{

    private ILawsuit mLawsuit; //����һ�����屻�����ߵ�����

    public Lawyer(ILawsuit lawsuit) {
        this.mLawsuit = lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }

}