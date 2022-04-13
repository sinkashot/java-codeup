package jump;

/**
 * 과목별 평균 점수 구하기
 * KO: 80, EN: 75, MATH: 55
 */

public class exam3_q1 {
    public static void main(String[] args) {
        int scoreKo = 80;
        int scoreEn = 75;
        int scoreMath = 55;

        int total = scoreKo + scoreEn + scoreMath;
        int avg = total / 3;

        System.out.printf("avg: %d",avg);
    }
}

