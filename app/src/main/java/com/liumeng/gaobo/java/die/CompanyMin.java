package com.liumeng.gaobo.java.die;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class CompanyMin implements Company{
    private List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("小民", 96, "男", "程序员"));
        list.add(new Employee("小云", 96, "女", "测试"));
        list.add(new Employee("小方", 96, "女", "测试"));
        list.add(new Employee("可儿", 96, "女", "设计"));
        list.add(new Employee("朗晴", 96, "女", "设计"));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
