class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {

        var maga = magazine

        for(i in 0..ransomNote.length-1){
           val c =  ransomNote[i]

           val index = maga.indexOf(c)

           if(index == -1)
                return false 

           maga =  maga.substring(0 , index) + maga.substring(index+1)
        }
        return true
    }
}