package com.liumeng.gaobo.java.zhongjiezhe;

public class CPU extends Colleague {
    private String dataVideo,dataSound;
    public CPU(Mediator mediator) {
        super(mediator);
    }
    public String getDataVideo(){
        return dataVideo;
    }
    public String getDataSound() {
        return dataSound;
    }

    /**
     * 解码数据
     * @param data
     */
    public void decodeData(String data){
        String[] tmp = data.split(",");
        dataVideo=tmp[0];
        dataSound=tmp[1];
        mediator.change(this);
    }
}