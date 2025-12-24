package br.todonext.todonext.Exception;

public class EmailBeingUsedException extends RuntimeException {
    public EmailBeingUsedException(String message) {
        super(message);
    }
}
