package jump;

/**
 * 주민번호 두 부분으로 나누기
 */

public class exam3_q3 {
    public static void main(String[] args) {
        String pin = "881120-1068234";

        System.out.printf("yymmdd:%s ",pin.substring(0,6));
        System.out.printf("privacy:%s ",pin.substring(7,14));
    }
}
