package com.liumeng.gaobo.java.others;
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("����ʦ��" + engineer.name + ",KPI��" + engineer.kpi);
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("����" + leader.name + ", KPI��" + leader.kpi + ",�²�Ʒ������" + leader.getProducts());
    }
}

