class Solution {
    fun average(salary: IntArray): Double {
     /*  val n_salary = salary.sorted()
       val size = salary.size
        var count = 0
        for(i in 1 .. size-2){
            count += n_salary.get(i)
        }
        return count / (size-2).toDouble()
        */
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var sum = 0.0
        salary.forEach {
            min = minOf(it, min)
            max = maxOf(it, max)
            sum += it
        }
        return (sum - (max + min)) / (salary.size - 2)
    }
}