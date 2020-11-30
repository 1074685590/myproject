package com.liumeng.gaobo.java.guan;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi,"+name+",DevtechFrotier更新啦,内容:"+arg);
    }

    @Override
    public String toString() {
        return "码农 :"+name;
    }
}
