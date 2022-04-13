package jump;

import java.util.Scanner;

/**
 * 자연수 13이 홀수?짝수?
 */

public class exam3_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        
        // int number = 13;
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
