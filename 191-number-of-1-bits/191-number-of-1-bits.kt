class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        
          var sum = 0  
       var list_n = Integer.toBinaryString(n) 
     
      /*  while (list_n > 0) {
           var x = list_n % 10 
            list_n = list_n / 10 
             if(x == 1.0) sum ++  
        } */
      
        for(i in 0 .. list_n.length-1){
             
            if(list_n.get(i).equals('1')) sum ++
        }
        return  sum
    
    }
}