class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var result = 10000
        var step = -1
        for((index,point) in points.withIndex()){
             if(x - point[0] == 0 || y - point[1] == 0){ //valid
                if( Math.abs(x - point[0]) + Math.abs(y - point[1]) < result){ //nearest & smallest
                    result = Math.abs(x - point[0]) + Math.abs(y - point[1])
                    step = index
                }
            }
        }
        
        
        return step
    }
}