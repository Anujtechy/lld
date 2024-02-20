package LowLevelDesigns.DesignVendingMachine;

public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public String toString() {
        return  "CodeNumber: " + code +
                ", " + item +
                ", isAvailable: " + !soldOut;
    }
}
