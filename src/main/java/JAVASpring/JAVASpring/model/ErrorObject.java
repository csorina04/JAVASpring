package JAVASpring.JAVASpring.model;

public class ErrorObject {

    private String message;
    private String errorCode;

    public ErrorObject(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    public ErrorObject() {


    }

    @Override
    public String toString() {
        return "ErrorObject{" +
                "message='" + message + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
