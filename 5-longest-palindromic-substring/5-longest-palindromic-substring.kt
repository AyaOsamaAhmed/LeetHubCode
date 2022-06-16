class Solution {
    fun longestPalindrome(s: String): String {
         if (s.length == 1) return s
    
    for (maxIndex in s.length - 1 downTo 0) {
      for (push in 0 until s.length - maxIndex) {
        var i = push
        var j = maxIndex + push
        var found = true
        
        while (i < j) {
          if (s[i++] == s[j--]) continue
          
          found = false
          break
        }
        
        if (found) return s.substring(push, maxIndex + push + 1)
      }
    }
    
    return ""
        
    }
}