package codeup;

import java.util.Scanner;

/*
어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
시간: 분
*/

public class C_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        System.out.printf("%s", time);

        sc.close();
    }
}
