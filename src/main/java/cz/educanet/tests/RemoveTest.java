package cz.educanet.tests;

import cz.educanet.collections.Set;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RemoveTest {

    private Set<Integer> set;

    @Test
    public void Should_Remove_Item() {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        //Fills up the set with list values
        for (Integer i : list) {
            set.add(i);
        }

        //Remove from set
        set.remove(10);
        set.remove(50);

        //Remove from list
        list.remove((Integer) 10);
        list.remove((Integer) 50);

        Lists.equals(list, set.toList());
    }
}
