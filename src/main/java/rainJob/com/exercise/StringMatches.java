package rainJob.com.exercise;


import java.io.UnsupportedEncodingException;

public class StringMatches {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = "%c20".getBytes("UNICODE");
        String unicode = new String(bytes,"UNICODE");
        System.out.println("unicode = " + unicode);
    }
}
