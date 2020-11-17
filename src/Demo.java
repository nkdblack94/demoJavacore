import java.util.Date;

public class Demo {
    synchronized void printTable(int n) { // synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Demo t;

    MyThread1(Demo t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Demo t;

    MyThread2(Demo t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization2 {
    public static void main(String args[]) {
        Demo obj = new Demo();// tao mot object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }

}
