/**
 * 두 개의 숫자를 입력받아 그 합을 출력하는 프로그램
 */

package jump.exam6;

import java.util.Scanner;

public class Exam6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input first number: ");
        int num1 = sc.nextInt();
        System.out.print("input second number: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.printf("sum : %d",num1+num2);
    }
}
