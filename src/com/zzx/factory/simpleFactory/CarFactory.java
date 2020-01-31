package com.zzx.factory.simpleFactory;

/*
 *工厂方法
 *任意定制生产过程
 */
public class CarFactory {
    public Car create() {
        // 加入权限控制
        // 加入日志系统
        // 创建交通工具
        System.out.println("xxxxxx");

        return new Car();

    }
}
