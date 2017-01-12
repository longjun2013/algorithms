package com.longjun.sorting.comparison;

public class QuickSort {
    public int[] action(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        sort(0, nums.length - 1, nums);
        return nums;
    }

    private void sort(int start, int end, int[] nums) {
        int l = start;
        int h = end;

        int pivot = nums[l];

        while (l < h) {
            while (l < h && nums[h] >= pivot) h--;
            if (l < h) swap(nums, l, h);
            while (l < h && nums[l] <= pivot) l++;
            if (l < h) swap(nums, l, h);
        }

        if (l > start) sort(start, l - 1, nums);
        if (h < end) sort(h + 1, end, nums);

    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}
