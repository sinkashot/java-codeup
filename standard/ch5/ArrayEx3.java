package standard.ch5;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("before..");
        System.out.println("length: " + arr.length);
        System.out.println(Arrays.toString(arr));

        int[] tmp = new int[arr.length * 2];
//        for (int i = 0; i < arr.length; i++) {
//            tmp[i] = arr[i];
//        }
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp; // 주소 변경
        System.out.println("after..");
        System.out.println("length: " + arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
