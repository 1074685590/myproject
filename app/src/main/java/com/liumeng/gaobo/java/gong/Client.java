package com.liumeng.gaobo.java.gong;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Client {
    public static void main(String[] args) {
        AudiCarFactory audiCarFactory = new AudiCarFactory();

        AudiQ3 audiCarQ3 = audiCarFactory.createAudiCar(AudiQ3.class);
        audiCarQ3.drive();
        audiCarQ3.selfNavigation();

        AudiQ5 audiCarQ5 = audiCarFactory.createAudiCar(AudiQ5.class);
        audiCarQ5.drive();
        audiCarQ5.selfNavigation();

        AudiQ7 audiCarQ7 = audiCarFactory.createAudiCar(AudiQ7.class);
        audiCarQ7.drive();
        audiCarQ7.selfNavigation();
    }
}
