package datastructures;

import datastructures.hashtable.java.CustomHashTable;
import org.junit.Assert;
import org.junit.Test;

public class TestHashTable {

    @Test
    public void testHashTable() {
        CustomHashTable<String,Integer> customHashTable = new CustomHashTable<>();
        customHashTable.put("A",10);
        Assert.assertEquals(10,customHashTable.getValue("A"));
        customHashTable.put("B",12);
        Assert.assertEquals(10,customHashTable.getValue("A"));
        Assert.assertEquals(12,customHashTable.getValue("B"));

        customHashTable.put("C",12);
        Assert.assertEquals(10,customHashTable.getValue("A"));
        Assert.assertEquals(12,customHashTable.getValue("B"));
        Assert.assertEquals(12,customHashTable.getValue("C"));

        customHashTable.remove("C");

        Assert.assertEquals(10,customHashTable.getValue("A"));
        Assert.assertEquals(12,customHashTable.getValue("B"));
        Assert.assertNull(customHashTable.getValue("C"));
    }
}
