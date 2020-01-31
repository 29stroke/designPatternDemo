package com.zzx.singleton;
/*
 * 懒汉式 lazy loading
 * 使用时才初始化，但是带来了多线程问题
 * 通过synchronized解决，但是加锁又会带来性能问题
 * 妄图通过减少同步代码块的方式提高效率
 */
public class Sngleton05 {
    private static Sngleton05 INSTANCE;
    private Sngleton05() {}
    public static Sngleton05 getInstance() {
        // 假如第一个线程进入到IF中但是还没来的及实例化，
        // 第二个线程这时候也进入到IF中，就造成了在两个线程中不是一个实例
        if (INSTANCE == null) {
            // 妄图通过减少同步代码块的方式提高效率，但是残念……
            // IF依然会进来
            synchronized (Sngleton05.class) {
                // 测试用代码，因为线程执行太快
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                INSTANCE = new Sngleton05();
            }
        }
        return INSTANCE;
    }

    public static void main(String args[]) {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                System.out.println(Sngleton05.getInstance().hashCode());
            }).start();
        }
    }
}
