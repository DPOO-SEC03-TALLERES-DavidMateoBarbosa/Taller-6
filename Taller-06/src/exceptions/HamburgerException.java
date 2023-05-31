package exceptions;

public class HamburgerException extends Throwable {
    public HamburgerException() {
        super();
    }

    public HamburgerException(String message) {
        super(message);
    }

    public HamburgerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HamburgerException(Throwable cause) {
        super(cause);
    }

    protected HamburgerException(String message, Throwable cause,
                                 boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
