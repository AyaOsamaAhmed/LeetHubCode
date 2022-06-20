class Solution {
    fun average(salary: IntArray): Double {
       val n_salary = salary.sorted()
       val size = salary.size
        var count = 0
      /*  if(size % 2 ==0 ) 
            return  (n_salary.get(size/2) + n_salary.get((size/2)-1))/2.toDouble()
       else
            return n_salary.get(size/2).toDouble()
            */
        for(i in 1 .. size-2){
            count += n_salary.get(i)
        }
        return count / (size-2).toDouble()
    }
}