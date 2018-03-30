package rainJob.com.util.enumCodes;

public enum CodeEnum {

    ERROR("-1", "程序异常"), SUCCESS("1", "程序成功");
    private String code;

    private String message;

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


}
