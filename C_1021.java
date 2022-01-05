import java.util.Scanner;

/**
 * 출력 예시: 한 단어 입력 후 그대로 출력
 */

public class C_1021 {
    public static void main(String[] args) {
        String value;

        Scanner sc = new Scanner(System.in);
        value = sc.nextLine();
        sc.close();

        System.out.printf("value: %s", value);
    }
}
