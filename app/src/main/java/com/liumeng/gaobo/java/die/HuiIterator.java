package com.liumeng.gaobo.java.die;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class HuiIterator implements Iterator {
    private Employee[] array;
    private int position;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length - 1 || array[position] == null);
    }

    @Override
    public Object next() {
        Employee e = array[position];
        position++;
        return e;
    }
}
