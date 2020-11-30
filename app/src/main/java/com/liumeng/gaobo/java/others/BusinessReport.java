package com.liumeng.gaobo.java.others;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<Staff>();

    public BusinessReport() {
        mStaffs.add(new Manager("�׾���"));
        mStaffs.add(new Engineer("����ʦ-jia"));
        mStaffs.add(new Engineer("����ʦ-wei"));
        mStaffs.add(new Engineer("����ʦ-wang"));
        mStaffs.add(new Engineer("����ʦ-shi"));
    }

    /**
     * Ϊ������չʾ����
     * @param visitor
     */
    public void showReport(Visitor visitor){
        for (Staff staff : mStaffs){
            staff.accept(visitor);
        }
    }
}

//�����߽ӿ�
