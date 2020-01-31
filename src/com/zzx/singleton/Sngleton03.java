package com.zzx.singleton;
/*
 * 懒汉式 lazy loading
 * 使用时才初始化，但是带来了多线程问题
 */
public class Sngleton03 {
    private static Sngleton03 INSTANCE;
    private Sngleton03() {}
    public static Sngleton03 getInstance() {
        // 假如第一个线程进入到IF中但是还没来的及实例化，
        // 第二个线程这时候也进入到IF中，就造成了在两个线程中不是一个实例
        if (INSTANCE == null) {
            // 测试用代码，因为线程执行太快
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Sngleton03();
        }
        return INSTANCE;
    }

    public static void main(String args[]) {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                // 同一类的不同对象的hash是不相同的
                System.out.println(Sngleton03.getInstance().hashCode());
            }).start();
        }
    }
}
