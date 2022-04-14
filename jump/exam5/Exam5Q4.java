/**
 * 다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해 정수로 리턴하는 avg 메서드를 추가
 */

package jump.exam5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class CalculatorQ4 {
    int value;

    CalculatorQ4() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] data) {
        int total = 0;
        for (int number : data) {
            total += number;
        }
        return total / data.length;
    }

    int avg(ArrayList<Integer> data) {
        int total = 0;
        Iterator<Integer> iter = data.iterator();
        while (iter.hasNext()) {
            total += iter.next();
        }
        return total / data.size();
    }
}

public class Exam5Q4 {
    public static void main(String[] args) {
        int[] data = {1,3,5,7,9};
        CalculatorQ4 cal = new CalculatorQ4();
        int result1 = cal.avg(data);
        System.out.printf("result1: %d\n",result1);

        ArrayList<Integer> listData = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        int result2 = cal.avg(listData);
        System.out.printf("result2: %d\n",result2);
    }
}
