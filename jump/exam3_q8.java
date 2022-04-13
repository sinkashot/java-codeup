package jump;

import java.util.HashMap;

/**
 * 다음의 맵 grade에서 "B'에 해당되는 값을 추출해 보자. (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)
 */

public class exam3_q8 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int result = grade.remove("B");
        System.out.printf("B grade: %d\n",result);
        System.out.println(grade);
    }
}
