package array;

/**
 * @author zyzhao
 * @date 2021年09月20日 23:05
 *
 * 给定一个m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 *
 * 进阶：
 *
 * 一个直观的解决方案是使用 O(mn)的额外空间，但这并不是一个好的解决方案。
 * 一个简单的改进方案是使用 O(m+n) 的额外空间，但这仍然不是最好的解决方案。
 * 你能想出一个仅使用常量空间的解决方案吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/set-matrix-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Q73SetMatrixZeroes {

    public void setZeroesMN(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] signRow = new int[rows];
        int[] signCol = new int[columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (matrix[i][j] == 0){
                    signRow[i] = 1;
                    signCol[j] = 1;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            if(signRow[i] == 1){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j<columns; j++){
            if(signCol[j] == 1){
                for(int i = 0; i < rows; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean signRow = false;
        boolean signCol = false;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (matrix[i][j] == 0){
                    if(i == 0){
                        signRow = true;
                    }else if(j == 0){
                        signCol = true;
                    }else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for(int i = 1; i < rows; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j<columns; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < rows; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
            for (int j = 0; j<columns; j++){
                matrix[0][j] = 0;
            }
        }
        if(signCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        if(signRow) {
            for (int j = 0; j < columns; j++) {
                matrix[0][j] = 0;
            }
        }
    }

}
