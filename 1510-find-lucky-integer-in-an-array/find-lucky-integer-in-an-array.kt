class Solution {
    fun findLucky(arr: IntArray): Int {
        val list = HashMap<Int , Int >()
        var max = -1 

        for (i in 0..arr.size-1){
            print(arr[i])
            list[arr[i]] = list.getOrDefault(arr[i], 0) +1   
        }
        print("$list -- ${list.size}")

        for ((key, value) in list){
        
           if(key == value){
                if(key > max )
                    max = key
            } 
        }

        return max
    }
}