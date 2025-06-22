class Solution {
    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        val result = mutableListOf<String>()
        var sub = ""
        var index = 1
        val size  = if( s.length % k > 0) ( k - s.length % k ) + s.length else   s.length
   
        repeat(size){ i ->
            if(index <= k){
                sub += if( i < s.length ) s[i] else fill
                index ++  
            }else{ 
                result.add(sub)
                index = 2
                sub = ""
                sub +=  if( i < s.length ) s[i] else fill
            }

        }

        result.add(sub)
        // upload solved ..
        return result.toTypedArray()
    }
}