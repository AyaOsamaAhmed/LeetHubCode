class Solution {
    fun minOperations(nums: IntArray, x: Int): Int {
     /*var result = -1
     var sum1 = 0
     var sum2 = 0
     var test_x = x
     var test_x2 = x
        nums.forEach{n ->
        if(n <= test_x){
            sum1 ++
            test_x -= n 
        } 
        }
      /*  if(test_x == 0) 
            return sum1 
        else{*/
            for(i in nums.size-1 downTo 0 ){
              
               //  if(nums[i] == test_x) { sum1++ ; test_x -= nums[i] }   
                 if(nums[i] <= test_x2){
                     sum2 ++
                     test_x2 -= nums[i]
                 }
                 if(test_x2 == 0) break
                 
            } 
        
            
        return    if(Math.min(sum1,sum2) == 0 ||(test_x2 !=0 && test_x != 0 )) result 
                    else    Math.min(sum1,sum2)*/
           var target = nums.sum() - x
        var p1 = 0
        var p2 = 0
        var longest = -1
        var sum = 0
        
        while(p2 < nums.size){
            sum += nums[p2]
            while(sum > target && p1 <= p2){
                sum -= nums[p1++]
            }
            if(sum == target){
                longest = Math.max(longest, p2 - p1 + 1)
            }
            p2++
        }
                
        return if(longest == -1) -1 else (nums.size - longest)
    
    }
}