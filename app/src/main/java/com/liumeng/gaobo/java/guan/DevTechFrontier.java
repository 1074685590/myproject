package com.liumeng.gaobo.java.guan;

import java.util.Observable;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class DevTechFrontier extends Observable {
    public void postNewPublication(String content) {
        //标识状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
