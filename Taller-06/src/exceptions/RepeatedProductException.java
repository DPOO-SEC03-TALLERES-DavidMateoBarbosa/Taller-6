package exceptions;
import core.MenuProduct;

public class RepeatedProductException extends HamburgerException {
    public final MenuProduct product;
    public final int line;
    public RepeatedProductException(String message, MenuProduct product, int line){
        super(message);
        this.product = product;
        this.line = line;
    }
}
