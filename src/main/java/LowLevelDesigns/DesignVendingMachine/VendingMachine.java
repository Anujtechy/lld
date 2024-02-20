package LowLevelDesigns.DesignVendingMachine;

import LowLevelDesigns.DesignVendingMachine.VendingStates.Impl.IdleState;
import LowLevelDesigns.DesignVendingMachine.VendingStates.State;
import LowLevelDesigns.DesignVendingMachine.enums.Coin;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        this.vendingMachineState =  new IdleState();
        this.inventory = new Inventory(10);
        this.coins = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
