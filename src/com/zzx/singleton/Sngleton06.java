package com.zzx.singleton;
/*
 * 懒汉式 lazy loading
 * 使用时才初始化，但是带来了多线程问题
 * 通过synchronized解决，但是加锁又会带来性能问题
 * 妄图通过减少同步代码块的方式提高效率，但是残念……
 * 所以出现了双重判断单例写法(+_+)?
 */
public class Sngleton06 {
    // 需要写volatile，因为编译成java汇编语言会出现指令重排问题
    private static volatile Sngleton06 INSTANCE;
    private Sngleton06() {}
    public static Sngleton06 getInstance() {
        if (INSTANCE == null) { // 这个if是有必要的，不然每次都加锁
            synchronized (Sngleton06.class) {
                // 双重判断
                if (INSTANCE == null) {
                    // 测试用代码，因为线程执行太快
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    INSTANCE = new Sngleton06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String args[]) {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                System.out.println(Sngleton06.getInstance().hashCode());
            }).start();
        }
    }
}
