class Solution {
    fun arraySign(nums: IntArray): Int {
        var multi = 1
        nums.forEach{n ->
            
            multi *= signFunc(n)
        }
        return multi  
    }
    
    fun signFunc(x:Int):Int{
        
         if(x == 0)  return 0
         else if(x > 0) return 1
         else if(x < 0) return -1
        
        return 0
    }
}