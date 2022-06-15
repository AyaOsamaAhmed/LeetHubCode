class Solution {
      fun isPred(a: String, b: String) : Boolean {
         if (a.length != b.length-1) return false
        var i = 0
        var j = 0
        var skipped = false
        while(i < a.length) {
            if (a[i] == b[j]) {
                i++
                j++
            } else if (skipped) return false 
            else {
                j++
                skipped = true
            }
        }
        return true
    }
    
    fun longestStrChain(words: Array<String>): Int {
       Arrays.sort(words, Comparator<String>{ a,b -> a.length - b.length })
       val memo = IntArray(words.size) { -1 }
       fun dfs(pos:Int) :Int {
           if (pos == words.size) return 0
           if (memo[pos] != -1) return memo[pos]
           val curr = words[pos]
           var max = 1
           for (i in (pos+1)..words.lastIndex) {
               val next = words[i]
               if (isPred(curr, next)) {
                   max = maxOf(max, 1+dfs(i))
               }
           }
           memo[pos] = max
           return max
       }
       var max = 0
       for(i in 0..words.lastIndex) max = maxOf(max, dfs(i))
       return max
    }
}