/**
 * 정수의 배열에서 홀수에만 2를 곱하여 저장하는 다음 코드가 있다.
 * 함수형 프로그래밍을 사용하여 표현해 보자.
 */

package jump.exam7;

// import java.util.ArrayList;
import java.util.Arrays;

/* @FunctionalInterface
interface CalculatorEx7Q4 {
    int doubleMultiply (int num);
} */

public class Exam7Q4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int[] result = Arrays.stream(numbers).filter((num) -> num % 2 == 1).map((num) -> num * 2).toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        
        // ArrayList<Integer> temp = new ArrayList<>();

        /* for (int num : numbers) {
            if (num % 2 == 1) {
                temp.add(num * 2);
            }
        } */
        
        /* for (int number : numbers) {
            CalculatorEx7Q4 cal = (num) -> num * 2;
            if (number % 2 == 1) {
                temp.add(cal.doubleMultiply(number));
            }
        } */

        /* int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
            System.out.println(result[i]);
        } */
    }
}
