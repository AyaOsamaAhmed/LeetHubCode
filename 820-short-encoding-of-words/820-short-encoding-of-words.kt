class Solution {
      class Trie {
        val next = Array<Trie?>(26) { null }
    }
    
    fun minimumLengthEncoding(words: Array<String>): Int {
        Arrays.sort(words, Comparator { a,b -> b.length - a.length })
        val trie = Trie()
        var wordsCount = words.size
        var wordsLen = 0
        words.forEach { w -> 
            var t = trie
            var isSuffix = true
            for (i in w.lastIndex downTo 0) {
                val ind = w[i].toInt() - 'a'.toInt()
                if (t.next[ind] == null) {
                    t.next[ind] = Trie()
                    isSuffix = false
                }
                t = t.next[ind]!!
            }
            if (isSuffix) {
                wordsCount--
            } else {
                wordsLen += w.length
            }
        }
        return wordsCount + wordsLen
        
   /* fun minimumLengthEncoding(words: Array<String>): Int {
        var result = words.get(0)
        var index = 0 
        
         if(words.size == 1) return result.length +1
        
        for( i in 1 .. words.size-1){
         if(result.contains(words.get(i))){
          //  val c = words.get(i)[0]
          //   index += result.indexOf(c)
             
         }else if(words.get(i).contains(result)){
               val c = result[0]
             result += words.get(i).subSequence(words.get(i).indexOf(c),words.get(i).length)
         }
            else{
             result += "#"+words.get(i)
              val c = words.get(i)[0]
             index += result.indexOf(c) 
         } 
        }
        result += "#"
        
        return result.length
    }*/
}
}