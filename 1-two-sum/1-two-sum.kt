class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       
        var index1 = 0
        var index2 = 0
        var result = intArrayOf(0,0)   
        for(num1 in nums){
            for(num2 in nums){
                if(num1+num2 == target && index2 != index1){
                 result = intArrayOf(index1,index2)  
                 return result
                }
                index2++
            }
            index1++
              index2 = 0
        }
         return result
    }
}