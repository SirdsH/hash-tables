package cz.educanet.tests;

import org.junit.jupiter.api.Assertions;

import java.util.Comparator;
import java.util.List;

public class Lists {

    //Checks if the compared lists are same or not
    //Does the fundamental test stuff (comparing if two outputs check)
    public static void equals(List<Integer> list, List<Integer> list2) {
        list = list.stream().sorted(Comparator.comparingInt(i -> i)).toList();
        list2 = list2.stream().sorted(Comparator.comparingInt(i -> i)).toList();

        if(list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                Assertions.assertEquals(list.get(i), list2.get(i));
            }
        }
    }
}
