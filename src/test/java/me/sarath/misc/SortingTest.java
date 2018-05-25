package me.sarath.misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Sarath
 */
public class SortingTest {

    @Test
    public void sortIntArray(){
        final int[] inputArr = {3,6,2,9,7};
        final int[] expectedArr = {2,3,6,7,9};

        Arrays.sort(inputArr);

        Assert.assertArrayEquals(expectedArr, inputArr);
    }
}
