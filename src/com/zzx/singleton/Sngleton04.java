package com.zzx.singleton;
/*
 * 懒汉式 lazy loading
 * 使用时才初始化，但是带来了多线程问题
 * 通过synchronized解决，但是加锁又会带来性能问题
 */
public class Sngleton04 {
    private static Sngleton04 INSTANCE;
    private Sngleton04() {}
    public static synchronized Sngleton04 getInstance() {
        // 假如第一个线程进入到IF中但是还没来的及实例化，
        // 第二个线程这时候也进入到IF中，就造成了在两个线程中不是一个实例
        if (INSTANCE == null) {
            // 测试用代码，因为线程执行太快
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Sngleton04();
        }
        return INSTANCE;
    }

    public static void main(String args[]) {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                System.out.println(Sngleton04.getInstance().hashCode());
            }).start();
        }
    }
}
