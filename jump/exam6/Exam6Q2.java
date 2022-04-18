/**
 * 영문을 입력하고 엔터를 입력하면 입력한 영문을 대문자로 변경하여 출력하는 프로그램을 작성하시오.
 * (단, 사용자가 "END" 라는 문자열을 입력하기 전까지 반복해서 문장을 입력받을 수 있게 할것)
 */

package jump.exam6;

import java.util.Scanner;

public class Exam6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("input text: ");
            String text = sc.nextLine();
            if (text.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println(text.toUpperCase());
        }
        sc.close();
    }
}
