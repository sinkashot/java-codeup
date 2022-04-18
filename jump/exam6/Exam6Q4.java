/**
 * 사용자의 입력을 파일(sample.txt)에 저장하는 프로그램을 작성해 보자.
 * (단 프로그램을 다시 실행하더라도 기존에 작성한 내용을 유지하고 새로 입력한 내용을 추가해야 한다.)
 */

package jump.exam6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam6Q4 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter("C:/workspace/java-codeup/out/file/inputText.txt", true));
        Scanner sc = new Scanner(System.in);
        while (true) {
            String inputText = sc.nextLine();
            if (inputText.equalsIgnoreCase("end")) {
                break;
            }
            pw.println(inputText);
        }
        sc.close();
        pw.close();
    }
}
