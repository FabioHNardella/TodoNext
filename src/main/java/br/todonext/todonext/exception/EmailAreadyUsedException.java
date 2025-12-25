package br.todonext.todonext.exception;

public class EmailAreadyUsedException extends RuntimeException {
    public EmailAreadyUsedException(String message) {
        super(message);
    }
}
