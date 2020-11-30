package com.liumeng.gaobo.java.gong;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public abstract class AudiFactory {
    /**
     * 某车型的工厂方法
     * @param clz  具体的SUV型号类型
     * @param <T>
     * @return 具体型号的SUV车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);

}
