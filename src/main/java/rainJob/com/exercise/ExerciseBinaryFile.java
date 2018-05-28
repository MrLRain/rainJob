package rainJob.com.exercise;

import java.io.*;

/**
 *  todo 缺少0 二进制转化的问题。 Integer.toBinaryString(c1)
 */
public class ExerciseBinaryFile {
    public static void main(String[] args) throws IOException {

        String str = "abc";
        FileOutputStream  bo = new FileOutputStream(new File("kill1.txt"));
        DataOutputStream  bos = new DataOutputStream(bo);
        for (int j = 0; j < str.length(); j++) {
            char c1 = str.charAt(j);
            int c = Integer.parseInt(Integer.toBinaryString(c1));
            System.out.println("c1 = " + c1);
            System.out.println("c= " + c);
            bos.writeBytes("0"+ c);
        }
    }
}
