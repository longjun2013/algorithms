package com.longjun.sorting.comparison;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    @Test
    public void testAction() throws Exception {
        QuickSort quickSort = new QuickSort();

        int[] nums = {5,54,232,124,677,43,9};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);
        assertThat(quickSort.action(nums), is(expected));
    }
}