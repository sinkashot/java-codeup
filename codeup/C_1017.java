package codeup;

import java.util.Scanner;

/*
int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
*/

public class C_1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d %d %d", num, num, num);
        sc.close();
    }
}
