package com.liumeng.gaobo.java.others;
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("����ʦ��"+engineer.name+",���뺯����"+engineer.getCodeLines());
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("����"+leader.name+",��Ʒ������"+leader.getProducts());
    }
}

//�ͻ��˴���
