package jump.exam7;

import java.util.ArrayList;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        work();
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

public class Exam7Q3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        /* for (int i = 1; i < 5; i++) {
            HeavyWork w = new HeavyWork("w" + i);
            w.work();
        } */

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i=1; i < 5; i++) {
            Thread t = new Thread(new HeavyWork("w" + i));
            t.start();
            threads.add(t);
        }

        for (Thread t : threads) {
            try {
                t.join(); // wait
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
