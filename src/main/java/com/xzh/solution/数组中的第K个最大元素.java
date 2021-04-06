package com.xzh.solution;

import java.util.PriorityQueue;

/**
 * @author 向振华
 * @date 2021/04/06 14:59
 */
public class 数组中的第K个最大元素 {

    /**
     * 小顶堆
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        // 小顶堆，堆顶是最小元素
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (Integer e : nums) {
            // 每个元素都要过一遍二叉堆
            pq.add(e);
            // 堆中元素多于 k 个时，删除堆顶元素
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // 剩下的是 nums 中 k 个最大元素，堆顶最小，第 K 个最大
        return pq.peek();
    }
}
