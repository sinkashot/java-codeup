package jump;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력
 */

public class exam3_q7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", list);
        System.out.println(result);
    }
}
