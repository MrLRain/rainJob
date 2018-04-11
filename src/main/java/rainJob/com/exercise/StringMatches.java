package rainJob.com.exercise;

public class StringMatches {
    public static void main(String[] args) {
        String waitValue = "飒飒啊";
        boolean matches = waitValue.matches("\\w{1,3}");
        System.out.println("matches = " + matches);
    }
}
