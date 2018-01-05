package rainJob.com.util.enumCodes;

public enum CodeEnum {

    Error("-1","程序异常");

    private String code;

    private String message;

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
