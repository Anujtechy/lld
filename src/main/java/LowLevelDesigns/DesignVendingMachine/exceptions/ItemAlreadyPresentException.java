package LowLevelDesigns.DesignVendingMachine.exceptions;

public class ItemAlreadyPresentException extends Throwable {
    public ItemAlreadyPresentException(String msg) {
        super(msg);
    }
}
