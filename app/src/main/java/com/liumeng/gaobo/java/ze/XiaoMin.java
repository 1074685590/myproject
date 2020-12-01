package com.liumeng.gaobo.java.ze;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class XiaoMin {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        groupLeader.handleRequest(50000);
    }
}
