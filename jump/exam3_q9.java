package jump;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * numbers 리스트에서 중복 숫자를 제거
 */

public class exam3_q9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        System.out.println(numbers);

        HashSet<Integer> setNumbers = new HashSet<>(numbers);
        System.out.println(setNumbers);
    }
}
