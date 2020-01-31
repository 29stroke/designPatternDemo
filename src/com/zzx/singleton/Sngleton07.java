package com.zzx.singleton;
/*
 * 静态内部类方式
 * JVM保证单例，jvm加载class时只加载一次，保证线程安全
 * 加载外部类时不会加载内部类，实现懒加载
 */
public class Sngleton07 {
    private Sngleton07() {}
    private static class Sngleton07Holder{
        private static final Sngleton07 INSTANCE = new Sngleton07();
    }

    public static Sngleton07 getInstance() {
        return Sngleton07Holder.INSTANCE;
    }

    public static void main(String args[]) {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                // 同一类的不同对象的hash是不相同的
                System.out.println(Sngleton07.getInstance().hashCode());
            }).start();
        }
    }
}
