package LowLevelDesigns.DesignVendingMachine.VendingStates;

import LowLevelDesigns.DesignVendingMachine.enums.Coin;
import LowLevelDesigns.DesignVendingMachine.Item;
import LowLevelDesigns.DesignVendingMachine.VendingMachine;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemAlreadyPresentException;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemNotFoundException;
import LowLevelDesigns.DesignVendingMachine.exceptions.ItemSoldOutException;

import java.util.List;

public interface State {
    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    void chooseProduct(VendingMachine machine, int productCode) throws Exception, ItemSoldOutException, ItemNotFoundException;
    int getChange(int returnChangeMoney) throws Exception;
    Item dispenseProduct(VendingMachine machine, int productCode) throws Exception, ItemSoldOutException, ItemNotFoundException;
    List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    void updateInventory(VendingMachine machine, Item item, int productCode) throws Exception, ItemAlreadyPresentException;
}
