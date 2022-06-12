class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
         val indices = mutableMapOf<Int, Int>()
        val prefixSum = IntArray(nums.size + 1) { 0 }  
        
        var ans = 0
        var lastIdx = -1
        nums.forEachIndexed { idx, num ->
            prefixSum[idx+1] = prefixSum[idx] + num
            if (num in indices) {
                lastIdx = Math.max(lastIdx, indices[num]!!)
            }
            ans = Math.max(ans, prefixSum[idx+1] - prefixSum[lastIdx+1])
            indices[num] = idx
        }
        return ans
      /*  var list = mutableListOf<Int>()
          
        for(i in 0 .. nums.size-1){ 
        if(!list.contains(nums.get(i))){
            list.add(nums.get(i)) 
        }}
        
        return list.sum() */
    }
}