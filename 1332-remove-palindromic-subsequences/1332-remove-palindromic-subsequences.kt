class Solution {
    fun removePalindromeSub(s: String): Int {
        var result = 0
        var m_result = 1
        var check_name = s.reversed()
        
        if(s.equals(check_name)) return 1
         else
        return 2
          /*  for (i in s.length-1 downTo 1 ){
            val test = s.subSequence(0,i)
             val re_test = test.reversed().toString()
            if(test == re_test  ) {
                result = result + m_result
               return   result 
            }else
                m_result++
                
            
        }*/
        
        
        return result 
    }
    
    fun check_a(c : Char):Boolean{
        if(c == 'a')
          return true
        else 
        return false
    }
}