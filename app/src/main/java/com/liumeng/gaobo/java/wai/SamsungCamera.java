package com.liumeng.gaobo.java.wai;

/**
 * Created by liumeng on 2020/12/1 0001.
 * Describe:
 */
public class SamsungCamera implements Camera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
