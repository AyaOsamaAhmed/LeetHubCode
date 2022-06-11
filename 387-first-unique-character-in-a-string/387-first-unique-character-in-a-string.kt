class Solution {
    fun firstUniqChar(s: String): Int {
      
       /* var new_s = s
        
        for((index,n) in new_s.withIndex()){ 
            for(i in (1 +index ) .. new_s.length-1){
                if(n == new_s.get(i)){ 
                    new_s = new_s.replace(n,'*')
                    break
                }   
            } 
        }
         for((index,n) in new_s.withIndex()){
            if(n !='*')
                return index
        }*/
         val sArr = s.toCharArray()
    
    for(i in sArr.indices){
        val temp = sArr[i]
        sArr[i] = '-'
        if(!sArr.contains(temp)) return i
            sArr[i] = temp
        }
 
        return -1 
    }
}