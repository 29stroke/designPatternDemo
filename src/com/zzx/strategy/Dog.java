package com.zzx.strategy;

public class Dog implements Comparable<Dog> {
    int shriek;

    public Dog(int shriek){
        this.shriek = shriek;
    }

    @Override
    public int compareTo(Dog dog) {
        if (this.shriek > dog.shriek) {
            return 1;
        } if (this.shriek < dog.shriek) {
            return -1;
        } else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Dog{shriek:"
                + this.shriek
                + "}";
    }
}
