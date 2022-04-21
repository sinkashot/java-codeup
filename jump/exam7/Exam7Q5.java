/**
 * 함수형 프로그래밍을 사용하여 다음의 정수 배열에서 음수를 모두 제거
 */

package jump.exam7;

import java.util.Arrays;

public class Exam7Q5 {
    public static void main(String[] args) {
        int[] numbers = {1,-2,3,-5,8,-3};
        int[] result = Arrays.stream(numbers).filter((num) -> num >= 0).toArray();
        for (int i : result) {
            System.out.println(i);
        }
    }
}
