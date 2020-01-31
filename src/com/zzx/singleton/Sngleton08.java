package com.zzx.singleton;
/*
 * 枚举单例，完美中的完美
 * 不仅可以解决线程同步，还可以防止反序列化和反射，
 * enum类进行反序列化得到的还是原来的对象
 * enum类不能用反射得到实例，会抛出IllegalArgumentException("Cannot reflectively create enum objects")的异常
 */
public enum Sngleton08 {

    INSTANCE;

    public static void main(String args[]) {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                // 同一类的不同对象的hash是不相同的
                System.out.println(Sngleton08.INSTANCE.hashCode());
            }).start();
        }
    }
}
