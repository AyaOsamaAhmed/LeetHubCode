class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var result = mutableListOf<Int>() 
        val size = numbers.size - 1
        
   
            for((index,num) in numbers.withIndex()){
                val next_step = index+1
            //   repeat(next_size){n ->
              for (n in next_step..size ){
              //  val current = n + 1
                   if(num+numbers[n] == target){
                       result.add(1+index)
                       result.add(1+n)
                       return result.toIntArray()
                   }      
            }
        }
         return result.toIntArray()
    }
}