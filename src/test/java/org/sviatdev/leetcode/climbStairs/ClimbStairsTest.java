package org.sviatdev.leetcode.climbStairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClimbStairsTest {

    private final ClimbStairs climbStairs = new ClimbStairs();
    @Test
    void test_case1(){
        int n = 2;
        int expected = 2;

        int actual = climbStairs.climbStairs(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test_case2(){
        int n = 3;
        int expected = 3;

        int actual = climbStairs.climbStairs(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test_case3(){
        int n = 4;
        int expected = 5;

        int actual = climbStairs.climbStairs(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test_case4(){
        int n = 5;
        int expected = 8;

        int actual = climbStairs.climbStairs(n);
        assertThat(actual).isEqualTo(expected);
    }

}