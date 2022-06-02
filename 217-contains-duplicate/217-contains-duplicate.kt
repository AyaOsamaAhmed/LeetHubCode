class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
      
        var index = 0   
        
        repeat(nums.size){i -> 
            index ++ 
            repeat(nums.size - index){j ->
                 
                if(nums[i] == nums[j+index]){
                    return true 
                }
            }
        }
        
        return false
    }
}