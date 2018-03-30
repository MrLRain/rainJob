package rainJob.com.dto;

import rainJob.com.util.enumCodes.CodeEnum;

public class Result {

    private static final ResponseMessage RESPONSE_MESSAGE_SUCCESS = new ResponseMessage(true, CodeEnum.SUCCESS, null);

    public static ResponseMessage success() {
        return RESPONSE_MESSAGE_SUCCESS;
    }

    public static <T> ResponseMessage<T> success(String code, T t) {
        return new ResponseMessage(true, CodeEnum.valueOf(code), t);
    }

    public static <T> ResponseMessage<T> success(CodeEnum code, T t) {
        return new ResponseMessage(true, code, t);
    }

    public static <T> ResponseMessage<T> success(String code, String message, T t) {
//        return new ResponseMessage(code, message, true, t);
        return null;
    }

    public static <T> ResponseMessage<T> success(T t) {
        return new ResponseMessage(true, CodeEnum.SUCCESS, t);
    }

    public static ResponseMessage error() {
        return error("");
    }

    public static ResponseMessage error(String message) {
        return error(CodeEnum.ERROR.getCode(), message);
    }

    public static ResponseMessage error(CodeEnum code) {
        return error(code.getCode(), code.getMessage(), null);
    }

    public static <T> ResponseMessage<T> error(CodeEnum code, T t) {
        return error(code.getCode(), code.getMessage(), t);
    }

    public static ResponseMessage error(String code, String message) {
        return error(code, message, null);
    }

    public static <T> ResponseMessage<T> error(String code, String message, T t) {
//        return new ResponseMessage(code, message, false, t);
        return null;
    }

}
