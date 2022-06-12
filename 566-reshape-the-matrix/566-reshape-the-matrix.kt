class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        
         if (mat.size * mat[0].size != r * c) return mat
    
    val reshaped = Array(r) { IntArray(c) }
    
    var k = 0
    var l = 0
    
    for (i in mat.indices) {
      for (j in mat[i].indices) {
        reshaped[k][l] = mat[i][j]
        
        if (++l == c) {
          l = 0
          k++
        }
      }
    }
    
    return reshaped
   /*     var result_row  = mutableListOf<Int>()
        var new_row  = mutableListOf<Int>()
        var index = 0 
         var result2 : Array<IntArray> = Array(r) { IntArray(c) }
        
        val size_r = mat.size
        val size_c = mat[0].size
        
        repeat(size_r){row ->
            for(i in 0 .. size_c -1){
                result_row.add(mat[row][i])
            }
        }
        var new_c = if(c > 2) c/r else c 
        repeat(r){row ->
             for(i in 0 .. (new_c-1)){ 
                new_row.add(result_row[index])
                index ++ 
            }
             result2[row] = new_row.toIntArray()
             new_row.clear()
        }
        
        return result2
        */
    }
}