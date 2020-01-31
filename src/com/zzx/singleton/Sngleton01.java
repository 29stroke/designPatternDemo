package com.zzx.singleton;
/*
 * 饿汉式
 * 类加载时就实例化了，JVM保证线程安全
 * 简单实用，推荐
 * 唯一缺点：不管用到与否，类加载时就实例化
 */
public class Sngleton01 {
    private static final Sngleton01 INSTANCE = new Sngleton01();
    private Sngleton01() {}
    public static Sngleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String args[]) {
        Sngleton01 sp01 = Sngleton01.getInstance();
        Sngleton01 sp02 = Sngleton01.getInstance();
        System.out.println(sp01 == sp02);
    }
}
