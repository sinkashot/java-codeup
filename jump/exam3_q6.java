package jump;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * [1,3,5,4,2] -> [5,4,3,2,1]
 */

public class exam3_q6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
