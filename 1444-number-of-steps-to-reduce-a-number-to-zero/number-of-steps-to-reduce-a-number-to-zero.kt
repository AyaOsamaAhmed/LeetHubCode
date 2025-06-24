class Solution {
    fun numberOfSteps(num: Int): Int {
        
        var nums = num
        var result = 0

        if(num == 0 ) return 0
        do{
            if(nums % 2 == 0){
                nums = nums / 2
                result ++
            }else{
                nums = nums - 1 
                result ++
            }
        }while(nums != 0 )

        return result
    }
}