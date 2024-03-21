package org.sviatdev.leetcode.climbStairs;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps.
In how many distinct ways can you climb to the top?

Constraints:

1 <= n <= 45
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int prev = 1, curr=1;
        for(int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev+curr;
            prev = temp;
        }
        return curr;
    }
}
