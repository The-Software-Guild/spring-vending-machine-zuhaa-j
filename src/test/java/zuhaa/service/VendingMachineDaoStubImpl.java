package zuhaa.service;

import com.mthree.c130.zuhaa.dao.Change;
import com.mthree.c130.zuhaa.dao.VendingMachineDao;
import com.mthree.c130.zuhaa.dao.VendingMachinePersistenceException;
import com.mthree.c130.zuhaa.dto.Item;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class VendingMachineDaoStubImpl implements VendingMachineDao {

    public Item firstItem, secondItem, thirdItem;

    public VendingMachineDaoStubImpl(){
        firstItem = new Item("Pringles", new BigDecimal("3.50"), 10);
        secondItem = new Item("Mars Bar", new BigDecimal("1.75"), 0);
        thirdItem = new Item("Water", new BigDecimal("2.00"), -10);
    }

    public Item getItem(int choice) throws VendingMachinePersistenceException {
        List<Item> itemList = this.getAllItems();
        if (itemList.get(choice) == firstItem){
            return firstItem;
        } else if (itemList.get(choice) == secondItem){
            return secondItem;
        } else if (itemList.get(choice) == thirdItem){
            return thirdItem;
        } else {
            return null;
        }
    }

    public List<Item> getAllItems() throws VendingMachinePersistenceException {
        List<Item> itemList = new ArrayList<>();
        itemList.add(firstItem);
        itemList.add(secondItem);
        itemList.add(thirdItem);
        return itemList;
    }

    public Item sellItem(Item soldItem) throws VendingMachinePersistenceException {
        if (soldItem == firstItem || soldItem == secondItem || soldItem == thirdItem){
            int oldInventory = soldItem.getInventory();
            soldItem.setInventory(oldInventory-1);
            return soldItem;
        } else {
            return null;
        }
    }

    public Map<Change, Integer> calculateChange(Item soldItem, BigDecimal amountPaid) throws VendingMachinePersistenceException {
        return null;
    }
}
