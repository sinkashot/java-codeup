/**
 * while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시
 */

package jump.exam4;

public class Exam4Q3 {
    public static void main(String[] args) {
        for (int i=0; i<6; i++) {
            String result = "";
            for (int j=0; j<i; j++) {
                result += "*";
            }
            System.out.println(result);
        }
    }
}
