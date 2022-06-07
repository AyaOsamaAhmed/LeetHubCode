class Solution {
    fun isAnagram( s: String, t: String): Boolean {
        var t_name = t.toCharArray()
        var s_name = s.toCharArray()
        var result = ""
       // t_name = t_name.sortedArray() 
        
        if(s.length == t.length){
            s_name.forEach{ sc ->
                val check = t_name.indexOf(sc)
              if(check > -1){
                 t_name.set(check , '*')
                   result = result.plus(sc)   //  result = t_name.toString().replace(sc,' ') 
              } 
            }
            if(result.equals(s))
                return true
            else
                return false
            
        }else
            return false 
        
    }
}