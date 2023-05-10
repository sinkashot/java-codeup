package codeup;

import java.util.Scanner;

/**
 * 1022 : [기초-입출력] 문장 1개 입력받아 그대로 출력하기
 * 공백이 포함되어 있는 한 문장이 입력된다.
 * 단, 입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝나며,
 * 최대 길이는 2000 문자를 넘지 않는다.
 */

public class C_1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine();
        sc.close();

        char[] charArray = inputValue.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
