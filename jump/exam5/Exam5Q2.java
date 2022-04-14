/**
 * 객체변수 value가 100 이상의 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스
 * MaxLimitCalculator 클래스는 반드시 Calculator 클래스를 상속
 * 
 * MaxLimitCalculator cal = new MaxLimitCalculator();
 * cal.add(50);  // 50 더하기
 * cal.add(60);  // 60 더하기
 * System.out.println(cal.getValue());  // 100 출력
 */

package jump.exam5;

class CalculatorQ2 {
    int value;

    CalculatorQ2() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class MaxLimitCalculator extends CalculatorQ2 {
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}

public class Exam5Q2 {
    public static void main(String[] args) {
        MaxLimitCalculator maxCal = new MaxLimitCalculator();
        maxCal.add(50);
        maxCal.add(60);
        System.out.println(maxCal.getValue());
    }
}
