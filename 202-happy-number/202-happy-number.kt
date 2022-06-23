class Solution {
    fun isHappy(n: Int): Boolean {
      
            var x = n
        val seenValues = HashSet<Int>() // Make sure we don't go to the same values again
        while (x != 1 && !(seenValues.contains(x))) {
            seenValues.add(x)
            x = squareOfDigit(x)
        }
        return x == 1 // We found a happy number!
             
    }
    fun squareOfDigit(x : Int):Int{
        var sum = 0 
        var nums = x
        while(nums > 0){
            val num = nums % 10
            nums = nums / 10
            sum += num*num
        }
        return sum 
    }
}