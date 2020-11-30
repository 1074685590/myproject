package com.liumeng.gaobo.java.zhongjiezhe;

public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void vidoePlay(String data){
        System.out.println("视频:"+data);
    }
}