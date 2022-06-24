class Solution {
    fun isPossible(target: IntArray): Boolean {
         if (target.size==1) return target[0] == 1
        // 7,5  7 = x + 5     x = 2
        // 1 1  2 5  5 = x + 2  x = 3
        // 2 1  2 3  3 = x + 2  x
        // 2 3
        // 5 2
        // 7
        val pq = PriorityQueue<Int>(reverseOrder())
        target.forEach { pq.add(it) }
        var sum = target.sum()
        //10 1   sum=11, prevSum = 10, sumOthers = sum-prevSum=1, replacedValue=prevSum-sumOthers=9, 
        //9 1    replacedValue > sumOthers, replacedValue -= sumOthers
        while(pq.peek() > 1) {
            val prevSum = pq.poll() // 7
            val sumOthers = sum - prevSum //12 - 7 = 5
            var replacedValue = prevSum - sumOthers // 7 - (12-7) = 7*2 - 12 = 2
            if (replacedValue > sumOthers) {
                replacedValue = replacedValue % sumOthers
                if (replacedValue == 0) replacedValue  = sumOthers
            }
            
            sum = replacedValue + sumOthers
            if (replacedValue < 1)  return false
            
            pq.add(replacedValue)
        }
        return pq.peek() == 1
    }
}