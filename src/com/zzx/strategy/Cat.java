package com.zzx.strategy;

public class Cat implements Comparable<Cat> {
    int weight;
    int height;

    public Cat(int weight, int height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat cat) {
        int thisSize = this.height + this.weight;
        int catSize = cat.height + cat.weight;
        if (thisSize > catSize) {
            return 1;
        } if (thisSize < catSize) {
            return -1;
        } else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Cat{weight:"
                + this.weight
                + ", height:"
                + this.height
                + "}";
    }
}
