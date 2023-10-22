package cz.educanet.tests;

import cz.educanet.collections.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AddTest {
    private Set<Integer> set;
    List<Integer> list = Arrays.asList(10,20,30,40,50);

    @Test
    public void Should_Add_Item_toSet_when_Absent(){
        //If the value isn't there fill it
        for (Integer i : list) {
            Assertions.assertTrue(set.add(i));
        }

        Lists.equals(list, set.toList());
    }

    @Test
    public void Should_Not_Add_Item_toSet_when_Present(){
        //Fills up the set with list values
        for (Integer i : list) {
            set.add(i);
        }

        //If the value isn't already there fill it
        for (Integer i : list) {
            Assertions.assertFalse(set.add(i));
        }

        Lists.equals(list, set.toList());
    }


}
