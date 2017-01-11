package com.longjun.sorting.comparison;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    @Test
    public void testAction() throws Exception {
        QuickSort quickSort = new QuickSort();

        int[] nums = {};
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);
        assertThat(quickSort.action(nums), is(expected));

        int[] nums2 = {1};
        int[] expected2 = Arrays.copyOf(nums2, nums2.length);
        Arrays.sort(expected2);
        assertThat(quickSort.action(nums2), is(expected2));

        int[] nums3 = {2,1};
        int[] expected3 = Arrays.copyOf(nums3, nums3.length);
        Arrays.sort(expected3);
        assertThat(quickSort.action(nums3), is(expected3));

        int[] nums4 = {5,4,2,3};
        int[] expected4 = Arrays.copyOf(nums4, nums4.length);
        Arrays.sort(expected4);
        assertThat(quickSort.action(nums4), is(expected4));
    }
}