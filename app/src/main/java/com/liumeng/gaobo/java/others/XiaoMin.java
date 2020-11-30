package com.liumeng.gaobo.java.others;
public class XiaoMin implements ILawsuit{

    @Override
    public void submit() {
        //С�������ٲ�
        System.out.println("�ϰ������Ƿ���ʣ��ش������ٲã�");
    }

    @Override
    public void burden() {
        //С���ύ֤��
        System.out.println("���Ǻ�ͬ��͹�ȥһ������й�����ˮ��");
    }

    @Override
    public void defend() {
        //��֤��ɽ
        System.out.println("֤��ȷ�䣬����Ҫ��˵ʲô��");
    }

    @Override
    public void finish() {
        //���
        System.out.println("���ϳɹ����о��ϰ弴���������ڽ��㹤�ʣ�");
    }

}