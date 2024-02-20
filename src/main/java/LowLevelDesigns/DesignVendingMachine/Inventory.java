package LowLevelDesigns.DesignVendingMachine;

import LowLevelDesigns.DesignVendingMachine.exceptions.ItemAlreadyPresentException;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemNotFoundException;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemSoldOutException;

import java.util.Arrays;
import java.util.Optional;

public class Inventory {
    ItemShelf[] inventory;
    public Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    private void initialEmptyInventory() {
        int initialCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf emptyShelf = new ItemShelf();
            emptyShelf.setCode(initialCode);
            emptyShelf.setSoldOut(true);
            inventory[i] = emptyShelf;
            initialCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws ItemAlreadyPresentException {
        Optional<ItemShelf> existingItemself = Arrays.stream(inventory)
                .filter(x -> x.code == codeNumber && !x.isSoldOut())
                .findFirst();

        existingItemself.ifPresentOrElse(
                (itemSelf) -> {
                    itemSelf.setItem(item);
                    itemSelf.setSoldOut(false);
                },
                () -> {
                    try {
                        throw new ItemAlreadyPresentException("Item with code " + codeNumber + " is already present. You cannot add the item here.");
                    } catch (ItemAlreadyPresentException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }

    public Item getItem(int codeNumber) throws ItemSoldOutException, ItemNotFoundException {
        Optional<ItemShelf> existingItemself = Arrays.stream(inventory)
                .filter(x -> x.code == codeNumber)
                .findFirst();

        if (existingItemself.isEmpty()) {
            throw new ItemNotFoundException("Item with code " + codeNumber + " not found");
        }

        ItemShelf itemSelf = existingItemself.get();

        if (itemSelf.isSoldOut()) {
            throw new ItemSoldOutException("Item with code " + codeNumber + " is already sold out");
        }

        return itemSelf.getItem();
    }

    public void updateSoldOutItem(int codeNumber) {
        Arrays.stream(inventory)
                .filter(x -> x.code == codeNumber)
                .forEach(x -> x.setSoldOut(true));
    }
}
