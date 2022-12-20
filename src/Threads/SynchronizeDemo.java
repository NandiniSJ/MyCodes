package Threads;

public class SynchronizeDemo extends Thread {
    Display d;
    String name;

    public SynchronizeDemo(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }

    public static void main(String[] args) {
        Display d = new Display();
        SynchronizeDemo t1 = new SynchronizeDemo(d, "Dhoni");
        SynchronizeDemo t2 = new SynchronizeDemo(d  ,"Yuvraj");
        t1.start();
        t2.start();
            }
}
