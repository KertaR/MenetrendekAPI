package hu.kertar.api.exception;

public class ApiClientException extends RuntimeException {

    public ApiClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiClientException(String message) {
        super(message);
    }
}
