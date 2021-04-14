package com.xzh.solution;

/**
 * @author 向振华
 * @date 2021/04/13 14:46
 */
public class 最大子序和 {

    public static int maxSubArray(int[] nums) {
        int ans = nums[0], sum = 0;
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1, 1, 2, 3, -1}));
    }
}
