package com.liumeng.gaobo.java.mo;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public abstract class AbstractComputer {

    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("硬件检查");
    }

    protected void  loadOS() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的计算机无验证,直接进入系统");
    }

    /**
     * 启动计算机方法,步骤固定为开启电脑,系统检查,加载操作系统,用户登录.改方法为final,防止算法框架被复写
     */
    public final void startUp() {
        System.out.println("----开机开始-----");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("----开机结束-----");
    }
}
