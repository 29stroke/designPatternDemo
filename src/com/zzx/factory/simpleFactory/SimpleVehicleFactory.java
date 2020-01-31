package com.zzx.factory.simpleFactory;

/*
 *简单工厂可扩展性不好
 *任意定制生产过程
 */
public class SimpleVehicleFactory {
    public Car createCat() {
        // 加入权限控制、
        // 加入日志系统
        // 创建交通工具
        return new Car();
    }
    public Plane createPlane() {
        // 加入权限控制、
        // 加入日志系统
        // 创建交通工具
        return new Plane();
    }
    public Train createTrain() {
        // 加入权限控制、
        // 加入日志系统
        // 创建交通工具
        return new Train();
    }
}
