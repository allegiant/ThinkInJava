package com.xuyongjin.thread;

/**
 * Created by 许勇进 on 2015-9-18.
 */
public class TicketThreadR implements Runnable {
    private int num = 5;
    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            try {
                Thread.currentThread().sleep(200);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.num > 0) {
                System.out.println(Thread.currentThread().getName()
                    + "买票: " + this.num--);
            }
        }
    }

    public static void main(String[] args) {
        TicketThreadR r = new TicketThreadR();

        Thread th1 = new Thread(r);
        th1.setName("售票口一");
        Thread th2 = new Thread(r);
        th2.setName("售票口二");
        Thread th3 = new Thread(r);
        th3.setName("售票口三");

        th1.start();
        th2.start();
        th3.start();
    }
}
