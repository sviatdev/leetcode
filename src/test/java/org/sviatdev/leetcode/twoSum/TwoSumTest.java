package org.sviatdev.leetcode.twoSum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void test_case1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        int[] actual = twoSum.twoSum(nums, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test_case2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1,2};

        int[] actual = twoSum.twoSum(nums, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test_case3() {
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0,1};

        int[] actual = twoSum.twoSum(nums, target);
        assertThat(actual).isEqualTo(expected);
    }

}