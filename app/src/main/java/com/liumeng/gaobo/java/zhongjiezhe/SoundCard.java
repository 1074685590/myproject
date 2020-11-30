package com.liumeng.gaobo.java.zhongjiezhe;

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void playSound(String data){
        System.out.println("音频:"+ data);
    }

}