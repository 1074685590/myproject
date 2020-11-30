package com.liumeng.gaobo.java.zhongjiezhe;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Client {
    public static void main(String args[]) {
        MainBoard mediator = new MainBoard();

        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard vc = new GraphicsCard(mediator);
        SoundCard sc = new SoundCard(mediator);

        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(vc);
        mediator.setSoundCard(sc);

        cdDevice.load();
    }
}
