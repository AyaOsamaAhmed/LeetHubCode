class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        
        var pos = 0 
        var first = 0 
        
        for (i in 0 ..s1.length-1){
            if(!s1.get(i).equals(s2.get(i)) ){
                pos ++
                if(pos == 1 ) first = i
                if(pos == 2 && ! s1.get(first).equals(s2.get(i))) return false
            }
            if(!s1.contains(s2.get(i))) return false
        } 
        return pos ==0 || pos == 2 
    }
}