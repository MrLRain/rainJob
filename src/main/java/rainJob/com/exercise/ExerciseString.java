package rainJob.com.exercise;

import org.junit.jupiter.api.Test;
import rainJob.com.entity.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExerciseString {

    @Test
    public void testMap(){
        String str = "select\n" +
                "         \n" +
                "      ID,CREATE_DATE,TABLE_NAME,TABLE_NAME_ZH\n" +
                "     \n" +
                "        from\n" +
                "        (select data.* , rownum row_id from\n" +
                "        (select\n" +
                "         \n" +
                "      ID,CREATE_DATE,TABLE_NAME,TABLE_NAME_ZH\n" +
                "     \n" +
                "        from\n" +
                "         \n" +
                "      SYXY_INTEGRATION\n" +
                "     \n" +
                "         \n" +
                "        where del = 1\n" +
                "         \n" +
                "             ";

        System.out.println(!str.contains("select")||!str.contains("SELECT"));
    }
    @Test
    public void testString(){
        Double aDouble = new Double("100000000000.699999");
        System.out.println("aDouble = " + aDouble.toString());
    }
    public static void main(String[] args) {
        String str = new String("");
        BigDecimal bigDecimal = new BigDecimal("100000000000000.888");
        System.out.println("bigDecimal = " + bigDecimal);
        if (bigDecimal instanceof BigDecimal) {
            System.out.println("bigDecimal = " + bigDecimal);
        }
        double maxValue = Double.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        double sd = 100000000000000.999;
        System.out.println("sd = " + sd);
        Double cc = new Double("10000000000000.888");//(15,3)//(14,3)998
        long l = cc.longValue();
        System.out.println("l = " + l);
        System.out.println(Double.MAX_EXPONENT);
        if (cc.doubleValue() == Double.MAX_EXPONENT) {
        }
        String s = bigDecimal.toPlainString();
        double v = bigDecimal.doubleValue();
        System.out.println("v = " + v);
        System.out.println("aDouble = " + s);
        System.out.println("cc = " + cc.doubleValue());
        System.out.println("Double.POSITIVE_INFINITY = " + Double.POSITIVE_INFINITY);
    }
}
