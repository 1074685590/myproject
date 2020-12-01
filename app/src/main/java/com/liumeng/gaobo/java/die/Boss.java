package com.liumeng.gaobo.java.die;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Boss {
    public static void main(String[] args) {
        CompanyMin companyMin = new CompanyMin();
        check(companyMin.iterator());

        CompanyHui companyHui = new CompanyHui();
        check(companyHui.iterator());
    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
