package codeup;

import java.util.Scanner;

public class C_1020 {
    public static void main(String[] args) {
        String privacyNumber;
        String[] splitNumber;

        System.out.print("input your number: ");
        Scanner sc = new Scanner(System.in);
        privacyNumber = sc.nextLine();
        sc.close();

        splitNumber = privacyNumber.split("-");
        System.out.println(splitNumber[0]+splitNumber[1]);
    }
}
