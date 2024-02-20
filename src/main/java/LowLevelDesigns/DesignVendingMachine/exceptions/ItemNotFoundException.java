package LowLevelDesigns.DesignVendingMachine.exceptions;

public class ItemNotFoundException extends Throwable {
    public ItemNotFoundException(String msg) {
        super(msg);
    }
}
