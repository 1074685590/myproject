package com.liumeng.gaobo.java.zhuang;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public abstract class PersonCloth extends Person {
    protected Person mPerson;

    public PersonCloth(Person person) {
        mPerson = person;
    }

    @Override
    public void dressed() {
        //调用Person类中的dressed方法
        mPerson.dressed();
    }
}
