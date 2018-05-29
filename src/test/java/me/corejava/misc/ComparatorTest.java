package me.corejava.misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sarath
 */
public class ComparatorTest {

    @Test
    public void numberSort(){
        final List<Integer> input = Arrays.asList(4,3,6,2,7);
        final List<Integer> expected = Arrays.asList(2,3,4,6,7);

        Collections.sort(input, new NumericOrder());

        Assert.assertEquals(expected, input);
    }



    private class NumericOrder implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }


}
