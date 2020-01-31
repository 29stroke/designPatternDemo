package com.zzx.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String arg[]) {
        Sorter sorter = new Sorter();

        Cat[] arrCat = {new Cat(12, 55), new Cat(5, 60), new Cat(19, 55)};
        CatHeightComparator catH = new CatHeightComparator();
        sorter.sort(arrCat, catH);
        System.out.println(Arrays.toString(arrCat));

        CatWeightComparator catW = new CatWeightComparator();
        sorter.sort(arrCat, catW);
        System.out.println(Arrays.toString(arrCat));

        Dog[] arrDog = {new Dog(465), new Dog(54), new Dog(0)};
        DogShriekComparator dogS = new DogShriekComparator();
        sorter.sort(arrDog, dogS);
        System.out.println(Arrays.toString(arrDog));
    }
}
