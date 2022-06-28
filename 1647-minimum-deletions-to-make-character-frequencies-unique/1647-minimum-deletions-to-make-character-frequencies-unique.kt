class Solution {
    fun minDeletions(s: String): Int {
       val nums = IntArray(26)
        
		for (c in s) {
            nums[c - 'a']++
        }

        val new = mutableSetOf<Int>()
        var dec = 0

        for (i in 0..25) {
            while (nums[i] > 0 && !new.add(nums[i])) {
                nums[i]--
                dec++
            }
        }

        return dec
   
    }
}