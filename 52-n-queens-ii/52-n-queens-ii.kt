class Solution {
    fun totalNQueens(N: Int): Int {
        
        
        var count = 0 
        val board = Array(N) { CharArray(N) { '.' } }
        
        fun isValid(row: Int, col: Int): Boolean { // check only top rows and diagonals
            for (i in 0 until row) {
                if (board[i][col] == 'Q')
                    return false
            }
            var (i, j) = row - 1 to col + 1 // top right
            while (i >= 0 && j < N) {
                if (board[i--][j++] == 'Q')
                    return false
            }
            i = row - 1
            j = col - 1
            while (i >= 0 && j >= 0) { // top left
                if (board[i--][j--] == 'Q')
                    return false
            }
            return true
        }
        
        fun backtrack(row: Int) {
            if (row == N) {
                count++
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
        return count
    }
}