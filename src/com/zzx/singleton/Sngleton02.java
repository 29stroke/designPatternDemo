package com.zzx.singleton;
/*
 * 既然是类加载就实例化，
 * 所以又有人写成用静态语句块实例化，
 * 和方法一其实没太大区别，用方法一就行了
 */
public class Sngleton02 {
    private static final Sngleton02 INSTANCE;
    static {
        INSTANCE = new Sngleton02();
    }
    private Sngleton02() {}
    public static Sngleton02 getInstance() {
        return INSTANCE;
    }

    public static void main(String args[]) {
        Sngleton02 sp01 = Sngleton02.getInstance();
        Sngleton02 sp02 = Sngleton02.getInstance();
        System.out.println(sp01 == sp02);
    }
}
