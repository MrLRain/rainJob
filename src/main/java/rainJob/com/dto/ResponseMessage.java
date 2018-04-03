package rainJob.com.dto;

import rainJob.com.util.enumCodes.CodeEnum;

public class ResponseMessage<T> {


    private boolean success;

    private CodeEnum codeEnum;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CodeEnum getCodeEnum() {
        return codeEnum;
    }

    public void setCodeEnum(CodeEnum codeEnum) {
        this.codeEnum = codeEnum;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseMessage(boolean success, CodeEnum codeEnum, T data) {
        this.success = success;
        this.codeEnum = codeEnum;
        this.data = data;
    }

    public ResponseMessage() {
    }

    public ResponseMessage<T> success(Object... data) {
        ResponseMessage<T> tResponseMessage = new ResponseMessage<>();
        if (data.length == 0) {
            tResponseMessage.setSuccess(true);
        } else if (data.length < 2 && data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                Object datum = data[i];
                tResponseMessage.setSuccess(true);
                if (datum instanceof CodeEnum) {
                    tResponseMessage.setCodeEnum((CodeEnum) datum);
                } else {
                    tResponseMessage.setData((T) datum);
                }
            }
        } else if (data.length == 2) {
            for (int i = 0; i < data.length; i++) {
                Object datum = data[i];
                if (datum instanceof Boolean) {
                    tResponseMessage.setSuccess(true);
                } else if (datum instanceof CodeEnum) {
                    tResponseMessage.setCodeEnum((CodeEnum) datum);
                } else {
                    tResponseMessage.setData((T) datum);
                }
            }
        }
        return tResponseMessage;
    }

    public ResponseMessage<T> error(Object... data) {
        ResponseMessage<T> tResponseMessage = new ResponseMessage<>();
        if (data.length == 0) {
            tResponseMessage.setSuccess(false);
        } else if (data.length < 2 && data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                Object datum = data[i];
                tResponseMessage.setSuccess(false);
                if (datum instanceof CodeEnum) {
                    tResponseMessage.setCodeEnum((CodeEnum) datum);
                } else {
                    tResponseMessage.setData((T) datum);
                }
            }
        }
        return tResponseMessage;
    }


}
