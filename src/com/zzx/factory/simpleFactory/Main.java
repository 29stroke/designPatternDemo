package com.zzx.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        //Moveble move = new Car();
        //move.go();

        // 简单工厂可扩展性不好
        SimpleVehicleFactory factory = new SimpleVehicleFactory();
        Moveble move = factory.createPlane();
        move.go();

        Moveble m = new CarFactory().create();
        m.go();


    }
}
