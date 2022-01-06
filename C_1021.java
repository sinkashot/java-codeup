import java.util.Scanner;

/**
 * 1021 : [기초-입출력] 단어 1개 입력받아 그대로 출력하기
 */

public class C_1021 {
    public static void main(String[] args) {
        char[] charArray = new char[50];
        String inputValue;

        Scanner sc = new Scanner(System.in);
        inputValue = sc.nextLine();
        sc.close();

        charArray = inputValue.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
