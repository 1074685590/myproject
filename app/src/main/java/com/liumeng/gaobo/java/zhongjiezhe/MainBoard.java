package com.liumeng.gaobo.java.zhongjiezhe;

public class MainBoard extends Mediator {
    private CDDevice     cdDevice;
    private CPU          cpu;
    private GraphicsCard graphicsCard;
    private SoundCard    soundCard ;
    @Override
    public void change(Colleague colleague) {
        //如果是光驱读取了数据
        if (colleague==cdDevice){
            handleCD((CDDevice) colleague);
        }
        //如果是cpu处理完数据
        if (colleague==cpu){
            handleCPU((CPU) colleague);
        }
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     * @param cdDevice
     */
    private void handleCD(CDDevice  cdDevice){
        cpu.decodeData(cdDevice.read());
    }

    /**
     * 处理cpu读取数据后与其他设备的交互
     * @param cpu
     */
    private void handleCPU(CPU cpu){
        soundCard.playSound(cpu.getDataSound());
        graphicsCard.vidoePlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}