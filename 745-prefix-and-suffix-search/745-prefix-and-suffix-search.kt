class WordFilter(words: Array<String>) {

      class Trie {
        val next = Array<Trie?>(26) { null }
        var ind = -1
        var suf:Trie? = null
    }
    val root = Trie()
    init {
        words.forEachIndexed { wi, w -> 
            var beg = root
            w.forEach { c ->
                val i = c.toInt() - 'a'.toInt()
                if (beg.next[i] == null) beg.next[i] = Trie()
                beg = beg.next[i]!!
                if (beg.suf==null) beg.suf = Trie()
                var end = beg.suf!!
                for (j in w.lastIndex downTo 0) {
                    val k = w[j].toInt() - 'a'.toInt()
                    if (end.next[k] == null) end.next[k] = Trie()
                    end = end.next[k]!!
                    end.ind = maxOf(end.ind, wi)
                }
            }
        }
    }
    fun f(prefix: String, suffix: String): Int {
        var beg = root
        for (j in 0..prefix.lastIndex) {
            val i = prefix[j].toInt() - 'a'.toInt()
            if (beg.next[i] == null) return -1
            beg = beg.next[i]!!
        }
        if (beg.suf==null) return -1
        var end = beg.suf!!
        for (j in suffix.lastIndex downTo 0) {
            val i = suffix[j].toInt() - 'a'.toInt()
            if (end.next[i] == null) return -1
            end = end.next[i]!!
        }
        return end.ind
    }

}

/**
 * Your WordFilter object will be instantiated and called as such:
 * var obj = WordFilter(words)
 * var param_1 = obj.f(prefix,suffix)
 */