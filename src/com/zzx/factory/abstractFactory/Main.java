package com.zzx.factory.abstractFactory;

public class Main {
    /*
     * 一位xx开着xx吃着xx并用xx射击敌人
     */
    public static void main(String[] args) {
//        // 开车
//        Car car = new Car();
//        car.go();
//        // 吃着好利来面包
//        Bread bread = new Bread();
//        bread.printName();
//        // 发射子弹
//        AK47 ak47 = new AK47();
//        ak47.shoot();
//
//        // 骑扫帚
//        Broom broom = new Broom();
//        broom.go();
//        // 吃着澳洲牛蛙
//        Frog frog = new Frog();
//        frog.printName();
//        // 发射魔弹
//        Wands wands = new Wands();
//        wands.shoot();

        AbstractFactory abstractFactory = new ModernWorldFactory();

        Vehicle vehicle = abstractFactory.createVehicle();
        vehicle.go();

        Food Food = abstractFactory.createFood();
        Food.printName();

        Weapon weapon = abstractFactory.createWeapon();
        weapon.shoot();


    }
}
