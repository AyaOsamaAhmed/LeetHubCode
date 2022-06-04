class Solution {
    fun solveNQueens(N: Int): List<List<String>> {
       /* var result : MutableList<List<String>> = ArrayList()
        var result1 = mutableListOf<String>()
        val size = n*n
        
        
        
        result1.add("Q")
        
        result.add(result1 )
        return result */
        
         val result = mutableListOf<List<String>>()
        val board = Array(N) { CharArray(N) { '.' } }

        fun isValid(row: Int, col: Int): Boolean { // check only top rows and cols
            for (i in 0 until row) {
                if (board[i][col] == 'Q')
                    return false
            }
            // top right 
            var (i, j) = row - 1 to col + 1
            while (i >= 0 && j < N) {
                if (board[i--][j++] == 'Q')
                    return false
            }
            // top left
            i = row - 1
            j = col - 1
            while (i >= 0 && j >= 0) {
                if (board[i--][j--] == 'Q')
                    return false
            }
            return true
        }

        fun construct() {
            val list = mutableListOf<String>()
            for (row in board) list.add(String(row))
            result.add(list)
        }

        fun backtrack(row: Int) {
            if (row == N) {
                construct()
                return
            }
            for (col in 0 until N) {
                if (isValid(row, col)) {
                    board[row][col] = 'Q'
                    backtrack(row + 1)
                    board[row][col] = '.'
                }
            }
        }
        
        backtrack(0)
        
        return result
    }
}