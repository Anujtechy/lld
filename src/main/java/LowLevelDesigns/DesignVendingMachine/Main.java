package LowLevelDesigns.DesignVendingMachine;

import LowLevelDesigns.DesignVendingMachine.VendingStates.State;
import LowLevelDesigns.DesignVendingMachine.enums.Coin;
import LowLevelDesigns.DesignVendingMachine.enums.ItemType;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemNotFoundException;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemSoldOutException;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        try {

            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKEL);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
            // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);


        } catch (ItemSoldOutException | ItemNotFoundException | Exception ex) {
            displayInventory(vendingMachine);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();

        IntStream.range(0, slots.length).forEach(i -> {
            Item newItem = new Item();
            if (i >= 0 && i < 3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i >= 7 && i < 10) {
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }

            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        });
    }

    private static void displayInventory(VendingMachine vendingMachine){
        Arrays.stream(vendingMachine.getInventory().getInventory())
                .map(ItemShelf::toString)
                .forEach(System.out::println);
    }

}
