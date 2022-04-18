/**
 * 다음과 같은 내용을 지닌 파일 sample.txt 파일이 있다.
 * 이 파일의 내용 중 "python" 이라는 문자열을 "java"로 바꾸어서 저장해 보자.
 */

package jump.exam6;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exam6Q5 {
    public static void main(String[] args) throws IOException{
        ArrayList<String> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:/workspace/java-codeup/out/file/sample.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            data.add(line);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileOutputStream("C:/workspace/java-codeup/out/file/sample.txt"));
        String text = String.join("\n",data);
        text = text.replaceAll("python", "java");
        pw.println(text);
        pw.close();
    }
}
