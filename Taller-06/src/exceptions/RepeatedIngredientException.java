package exceptions;
import core.Ingredient;

public class RepeatedIngredientException extends HamburgerException {
    public final Ingredient ingredient;
    public final int line;
    public RepeatedIngredientException(String message, Ingredient ingredient, int line){
        super(message);
        this.ingredient = ingredient;
        this.line = line;
    }
}
