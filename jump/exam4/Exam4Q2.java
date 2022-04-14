/**
 * while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
 */

package jump.exam4;

public class Exam4Q2 {
    public static void main(String[] args) {
        int result = 0;
        int number = 1;
        while (number <= 1000) {
            if ((number % 3) == 0) {
                result += number;
            }
            number++;
        }
        System.out.println(result);
    }
}
