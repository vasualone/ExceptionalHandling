package ExceptionalHandling;

public class VasuException extends Throwable {
    public VasuException(String errorMsg) {
         super("welcome to voter website: "+errorMsg);
    }
}