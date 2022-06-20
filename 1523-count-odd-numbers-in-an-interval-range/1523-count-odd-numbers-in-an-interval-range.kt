class Solution {
    fun countOdds(low: Int, high: Int): Int {
       /* var count = 0 
        for (i in low .. high){
            if(i %2 != 0 )
                count ++
        }*/
        
        return  (high - low)/2 + if(high % 2 !=0 || low % 2 != 0 ) 1 else 0
    }
}