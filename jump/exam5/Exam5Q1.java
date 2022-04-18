/**
 * Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가
 */

package jump.exam5;

class CalculatorQ1 {
    int value;

    CalculatorQ1() {
        this.value = 0;
    }

    int getValue() {
        return this.value;
    }

    void add(int val) {
        this.value += val;
    }
}

class UpgradeCalculator extends CalculatorQ1 {
    void minus(int val) {
        this.value -= val;
    }
}

public class Exam5Q1 {
    public static void main(String[] args) {
        CalculatorQ1 cal = new CalculatorQ1();
        cal.add(10);
        System.out.println(cal.getValue());

        UpgradeCalculator upCal = new UpgradeCalculator();
        upCal.add(10);
        upCal.minus(3);
        System.out.println(upCal.getValue());
    }
}
