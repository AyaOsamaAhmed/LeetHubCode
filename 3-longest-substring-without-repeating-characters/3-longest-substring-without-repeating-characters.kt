class Solution {
    fun lengthOfLongestSubstring(str: String): Int {
          val seen = HashSet<Char>()
        var p1 = 0
        var p2 = 0
        var max = 0
        
        while(p2 < str.length){
            while(p1 <= p2 && seen.contains(str[p2])){
                seen.remove(str[p1])
                p1++
            }
            seen.add(str[p2])
            max = Math.max(max, seen.size)
            p2++
        }
        
        return max
      /*  var result = mutableListOf<Char>()
        val size = s.length
        
     //   s.forEach{x ->
        for((index,x) in s.withIndex()){
            if(!result.contains(x)){
                result.add(x)  
            }
             else if(index -2 == result.indexOf(x)){
                 
                    result.remove(x)
                result.add(x)
             }else if((size - index) > result.size){
                 result.clear()
                result.add(x)
                 }else 
                    break
             }
        
        return result.size*/
    }
}