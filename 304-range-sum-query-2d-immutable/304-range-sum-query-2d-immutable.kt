class NumMatrix(val matrix: Array<IntArray>) {

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int  {
      
        var sum = 0 
        
            for (i in row1 .. row2) {
            for (j in col1 .. col2) {
                sum += matrix[i][j]
            }
        }
        
        
        return sum
        
    } 
        
        
         
    

}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */