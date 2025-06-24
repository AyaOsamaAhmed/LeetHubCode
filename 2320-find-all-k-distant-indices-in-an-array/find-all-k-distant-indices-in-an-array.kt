class Solution {
    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        
        val savedIndexs =  mutableListOf<Int>()
        val resultIndexs =  mutableListOf<Int>()

       for (i in 0..nums.size-1){
            if(nums[i] == key){
                savedIndexs.add(i)
                println("s  $i")
            }
       }

       if(savedIndexs.size == nums.size){
            println("rS  $savedIndexs")
            return savedIndexs
       }
        else{
             for (i in 0..nums.size-1){
                if(i in savedIndexs){
                    resultIndexs.add(i)
                      println("e  $i")
                }else{ 

                    for(j in savedIndexs){
                        if(Math.abs(i - j) <= k){
                             resultIndexs.add(i)
                               println("t  $i $j  $k - ${Math.abs(i - j) <= k}")
                             break
                        }
                            
                    }
                }
             }
        }
        println("rR  $resultIndexs")
        return resultIndexs
    }
}