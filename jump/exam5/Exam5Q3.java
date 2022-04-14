/**
 * Calculator 클래스에 주어진 정수가 홀수인지 짝수인지 판별해 주는 메서드(isOdd)를 추가해 보자. (홀수이면 true, 짝수면 false를 리턴해야 한다.)
 */

package jump.exam5;

class CalculatorQ3 {
    int value;

    CalculatorQ3() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        return (val % 2) != 0 ? true : false ;
    }
}

public class Exam5Q3 {
    public static void main(String[] args) {
        CalculatorQ3 cal = new CalculatorQ3();
        System.out.println(cal.isOdd(1));
        System.out.println(cal.isOdd(2));
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(37));
        System.out.println(cal.isOdd(50));
        System.out.println(cal.isOdd(100));
    }
}
