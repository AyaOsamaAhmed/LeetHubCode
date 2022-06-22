class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        var new_nums  = nums.sortedArrayDescending()
        
         for(i in 0 .. nums.size-3) {                       // third largest number
        if(new_nums[i+1]+new_nums[i+2] > new_nums[i])  //sum two numbers > from thrid number
            return new_nums[i]+new_nums[i+1]+new_nums[i+2]
    }
         return 0
        
}
} 