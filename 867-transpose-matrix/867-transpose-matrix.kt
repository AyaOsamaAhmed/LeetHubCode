class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> = Array(matrix[0].size) { y -> IntArray(matrix.size) { x -> matrix[x][y] } }
    
}