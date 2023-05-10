package standard.ch13_thread;

public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-")); // new String 수행시간 측정 위해 속도 늦춤
        }

        System.out.println("소요시간1: " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|")); // new String 수행시간 측정 위해 속도 늦춤
        }

        System.out.println("소요시간2: " + (System.currentTimeMillis() - startTime));
    }
}
