package Threads;

public class MyThread extends Thread {

    public void run() {
        System.out.println("child thread");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();



        System.out.println("main Thread");
    }
}
