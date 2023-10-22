package cz.educanet.tests;

import cz.educanet.collections.Set;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ToListTest {
    private Set<Integer> set;
    List<Integer> list = Arrays.asList(10,20,30,40,50);


    @Test
    public void Should_Equal(){
        //Fills up the set with list values
        for (Integer i : list) {
            set.add(i);
        }

        Lists.equals(list,set.toList());
    }
}
