package standard.ch5_array;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
//        int[] score = new int[5];
//        int[] score = new int[]{50, 60, 70, 80, 90};
        int[] score = {50, 60, 70, 80, 90};
        int k = 1;

//        score[0] = 50;
//        score[1] = 60;
//        score[k+1] = 70;
//        score[3] = 80;
//        score[4] = 90;

        int tmp = score[k+2] + score[4];

        // for문 출력
//        for (int i = 0; i < score.length; i++) {
//            System.out.printf("score[%d]: %d%n", i, score[i]);
//            System.out.println("score: " + score[i]);
//        }
        System.out.println(Arrays.toString(score));

        System.out.printf("tmp: %d%n", tmp);
//        System.out.printf("score[%d]: %d%n", 7, score[7]);

        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr);
    }
}
