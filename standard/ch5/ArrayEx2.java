package standard.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr = new int[10];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.print(Arrays.toString(iArr));
    }
}
