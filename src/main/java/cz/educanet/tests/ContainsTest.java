package cz.educanet.tests;

import cz.educanet.collections.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ContainsTest {
    private Set<Integer> set;
    List<Integer> list = Arrays.asList(10,20,30,40,50);

    @Test
    public void Should_Return_True_When_Item_isPresent() {
        //Fills up the set with list values
        for (Integer i : list) {
            set.add(i);
        }

        //Checks if the item is there, returns true because value from list is present in set
        for (Integer i : list) {
            Assertions.assertTrue(set.contains(i));
        }
    }

    @Test
    public void Should_Return_False_When_Item_isAbsent() {
        List<Integer> list2 = Arrays.asList(0,1,11,111,21);

        //Fills up the set with list values
        for (Integer i : list) {
            set.add(i);
        }

        //Checks if the two are same, returns false because value from list2 is absent in set
        for (Integer i : list2) {
            Assertions.assertFalse(set.contains(i));
        }
    }
}
