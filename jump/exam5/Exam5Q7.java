/**
 * 광물 계산기는 금인 경우 100, 은인 경우 90, 구리의 경우는 80의 가치를 더하는 기능(add 메스드)이 있다.
 * 하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다.
 * 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정
 */
package jump.exam5;

interface Mineral {
    int getValue();
}

class Gold implements Mineral {
    public int getValue() {
        return 100;
    }
}

class Silver implements Mineral {
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineral {
    public int getValue() {
        return 80;
    }
}

class Steel implements Mineral {
    public int getValue() {
        return 50;
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        System.out.println(mineral.getValue());
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class Exam5Q7 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        cal.add(new Steel());
        System.out.println(cal.getValue());  // 270 출력
    }
}
