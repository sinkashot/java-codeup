package codingtest;

import java.util.*;

public class SameNumberHate {
    public static void main(String[] args) {
        //arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
        // int[] input = {1, 1, 3, 3, 0, 1, 1};

        //arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
        int[] input = {4, 4, 4, 3, 3};

        SameNumberHate sameNumberHate = new SameNumberHate();
        int[] result = sameNumberHate.solution(input);
        
        for (int i : result) {
            System.out.println("result:"+i);
        }
    }

    public int[] solution(int []arr) {
        System.out.println("arr.length: "+arr.length);

        ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
        for (int number : arr) {
            list.add(number);
        }
        System.out.println("list.size: "+list.size());

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int baseNumber = iterator.next();
            for (Integer integer : list) {
                
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int baseNumber = list.get(i);

            List<Integer> deleteList = new ArrayList<Integer>();
            for (int j = i+1; j < list.size(); j++) {
                if (baseNumber == list.get(j)) {
                    deleteList.add(j);
                } else {
                    break;
                }
            }

            for (int index : deleteList) {
                list.remove(index);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            // System.out.println(answer[i]);
        }

        return answer;
    }
}
