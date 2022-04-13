package jump;

/**
 * a:b:c:d replace -> a#b#c#d
 */

public class exam3_q5 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        System.out.println(a.replaceAll(":", "#"));
    }
}
