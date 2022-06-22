class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val new_nums = nums.sortedArrayDescending()
        return new_nums[k-1]
    }
}