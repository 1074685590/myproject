package com.liumeng.gaobo.java.bei;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        CallOfDuty callOfDuty = new CallOfDuty();
        callOfDuty.play();

        Caretaker caretaker = new Caretaker();
        caretaker.archive(callOfDuty.createMemoto());
        callOfDuty.quit();
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemoto());
    }
}
