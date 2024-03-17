package leetcode.twoSum;

import org.junit.jupiter.api.Test;
import org.sviatdev.leetcode.twoSum.TwoSum;

import static org.assertj.core.api.Assertions.assertThat;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
public class SolutionTest {

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
