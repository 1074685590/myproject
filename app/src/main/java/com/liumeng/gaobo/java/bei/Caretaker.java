package com.liumeng.gaobo.java.bei;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe: 负责管理Memoto
 */
public class Caretaker {

    Memoto mMemoto;

    public void archive(Memoto memoto) {
        this.mMemoto = memoto;
    }

    public Memoto getMemoto() {
        return mMemoto;
    }
}
