class Solution {
    fun runningSum(nums: IntArray): IntArray {
        
        var result :IntArray = nums
        val size = nums.size
        var last_total = 0
        
        repeat(size){num ->
            
            val number = nums[num]
            last_total = number + last_total 
            result[num] = last_total
            
        }
        return result
        
    }
}