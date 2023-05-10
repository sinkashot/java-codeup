package codeup;

import java.util.Scanner;

/*
년,월,일이 "."으로 구분되어 입력
입력 받은 년월일을 yyyy/mm/dd로 출력
*/

public class C_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        sc.close();

        String regex = "[.]";
        String[] date = input.split(regex);

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.printf("%04d/%02d/%02d", year, month, day);
    }
}
