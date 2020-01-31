package com.zzx.strategy;

import java.util.Comparator;

/*
 *狗的叫声比较器
 */
public class DogShriekComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.shriek < o2.shriek) {
            return -1;
        } else if (o1.shriek > o2.shriek) {
            return 1;
        } else {
            return 0;
        }
    }
}
