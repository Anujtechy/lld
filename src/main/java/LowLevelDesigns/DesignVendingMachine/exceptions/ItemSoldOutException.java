package LowLevelDesigns.DesignVendingMachine.exceptions;

public class ItemSoldOutException extends Throwable {
    public ItemSoldOutException(String msg) {
        super(msg);
    }
}
