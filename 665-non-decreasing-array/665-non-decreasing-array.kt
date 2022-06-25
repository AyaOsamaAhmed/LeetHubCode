class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
            var ind = -1
       for(i in 1..nums.lastIndex) {
            if (nums[i-1] > nums[i]) {
                if (ind != -1) return false
                ind = i
            }
        }
        if (ind == -1) return true
          // 1 2 3 4 5 6 7 8 1 
          //                 ^
        if (ind == nums.lastIndex) return true
        return nums[ind-1] <= nums[ind+1] || ind > 1 && nums[ind-2] <= nums[ind] || ind == 1 
    }
}