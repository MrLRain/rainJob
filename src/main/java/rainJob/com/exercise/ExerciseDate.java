package rainJob.com.exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DAY_OF_MONTH;

public class ExerciseDate {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//        String format = simpleDateFormat.format(new Date());
//        System.out.println("format = " + format);
//        format = simpleDateFormat1.format(new Date());
//        System.out.println("format = " + format);

        Calendar calendar = Calendar.getInstance();
        calendar.add(DAY_OF_MONTH,-1);
        Date time = calendar.getTime();
        System.out.println("time = " + time);

    }
}
