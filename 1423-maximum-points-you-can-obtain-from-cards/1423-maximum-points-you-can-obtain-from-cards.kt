class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        val n= cardPoints.size	
		if (k > n || k <= 0) return -1
		
		var sum = 0
		for (card in cardPoints) {
			sum+= card
        }

        if (n == k) return sum

        // create a window of size n-k and move it to get min sum
        var ws = Integer.MAX_VALUE

        var current = 0
        var index = 0
        while (index < n-k) {
            current+= cardPoints[index]
            index++
        }
        ws = Math.min(ws, current)

        // move this window till end
        var start = 0
        while (index < n) {
            current = current - cardPoints[start++] + cardPoints[index++]
            ws = Math.min(ws, current)
        }
        return sum - ws
    }
}