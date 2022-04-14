/**
 * A 학급에 총 10명의 학생 marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100}
 * for each 문을 사용하여 A 학급의 평균 점수
 */

package jump.exam4;

public class Exam4Q5 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int score : marks) {
            total += score;
        }
        float avg = (float)(total/marks.length);
        System.out.println(avg);
    }
}
