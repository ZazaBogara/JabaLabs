package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    @Test
    public void ShopTest() {
        List<Plants> list= new ArrayList<>();
        list.add( new Tree("oak", 1, 100, 1, Plants.WhenGrow.Spring, 56));
        list.add(new Flowers("flower", 2, 200, 30, Plants.WhenGrow.Summer, Flowers.Color.Green));
        list.add(new Bush("bush", 3, 500, 4, Plants.WhenGrow.Outumn, true));

        Shop myShop = new Shop();
        myShop.addToCatalog(list.get(0));
        myShop.addToCatalog(list.get(1));
        myShop.addToCatalog(list.get(2));
        myShop.sortDown("cost");
        assertEquals(myShop.catallog.get(0).name, "bush");

        PlantsWriter plantsWriter = new PlantsWriter();
        plantsWriter.writeToFile(myShop.catallog);

        myShop.removeFromCatalog(myShop.catallog.get(1), 1);
        assertEquals(list.get(1).amount, 29);
    }

    @Test
    public void DifferentPlantsTest() {
        List<Plants> list= new ArrayList<>();
        list.add( new Tree("oak", 1, 100, 1, Plants.WhenGrow.Spring, 56));
        list.add(new Flowers("flower", 2, 200, 30, Plants.WhenGrow.Summer, Flowers.Color.Green));
        list.add(new Bush("bush", 3, 500, 4, Plants.WhenGrow.Outumn, true));
        assertEquals(list.get(0).canBeGrown, Plants.WhenGrow.Spring);
        assertEquals(list.get(1).amount, 30);
        assertEquals(list.get(2).cost, 500);
    }

}
