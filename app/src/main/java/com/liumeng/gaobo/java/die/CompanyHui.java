package com.liumeng.gaobo.java.die;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class CompanyHui implements Company{
    private Employee[] array = new Employee[3];

    public CompanyHui() {
        array[0] = new Employee("辉哥", 108, "男", "程序员");
        array[1] = new Employee("小红", 98, "男", "程序员");
        array[2] = new Employee("小辉", 88, "男", "程序员");
    }

    public Employee[] getEmployees() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
