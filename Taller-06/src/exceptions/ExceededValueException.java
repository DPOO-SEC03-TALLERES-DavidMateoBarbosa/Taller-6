package exceptions;

public class ExceededValueException extends HamburgerException{
    public final int value, line;
    public ExceededValueException(String message, int value, int line){
        super(message);
        this.value = value;
        this.line = line;
    }
}
