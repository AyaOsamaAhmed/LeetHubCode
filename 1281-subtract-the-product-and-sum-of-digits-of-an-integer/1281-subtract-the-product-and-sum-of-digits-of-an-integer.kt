class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var sum = 0 
        var product = 1 
       var list_n = n
        
        while (list_n > 0) {
           val x = list_n % 10
            list_n = list_n / 10
             sum += x
           product *= x  
        }
        
     /*  for(i in 0 .. n.toString().length-1){
           val num = n.toString().get(i).digitToIntOrNull()
           sum += num
           product *= num 
           return num
       }*/
        return product - sum 
    }
}