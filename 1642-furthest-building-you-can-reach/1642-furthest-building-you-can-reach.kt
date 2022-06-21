class Solution {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
          fun canReach(to: Int) :Boolean {
            val diffs = Array<Int>(to) { i -> heights[i+1] - heights[i] }
            Arrays.sort(diffs, Comparator{ a,b -> if(b>a) 1 else if (b<a) -1 else 0 } )
            var lad = ladders
            var br = bricks
            for (d in diffs) {
                if (d < 0) return@canReach true
                if (lad > 0) lad--
                else if (br >= d) br = br - d
                else return@canReach false
            }
            return@canReach true
        }
        var lo = 1
        var hi = heights.lastIndex
        var max = 0
        while (lo <= hi) {
            val mid = lo + (hi-lo)/2
            if (canReach(mid)){
              max = maxOf(max, mid)
              lo = mid + 1   
            } else hi = mid - 1
        }
        return max
    }
}