/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
      
            //intialize boundaries
            int top=0, left=0;
            int bottom=n-1, right=n-1;
            //initialize an array
            int[][] mat= new int[n][n];
            // the number added into the matrix
            int a = 1;
             
            // traverse the matrix 
            // break if the loop condition fails 
            while(true){
                //left to right, then cross out the upper boundary
                for(int i=left; i<=right; i++){
                    mat[top][i]= a++;
                }
                //reset the upper boundary, if top> bottom, break the loop
                if (++top > bottom) break;

                //top to bottom, then cross out the right boundary
                for(int i=top; i<=bottom; i++){
                    mat[i][right]= a++;
                }
                //reset the right boundary as above 
                if (--right<left) break;

                //right to left
                for(int i=right; i>=left; i--){
                    mat[bottom][i]= a++;
                }
                if (--bottom<top) break;

                //bottom to top, a column->[][]的第二个[]
                for(int i=bottom;i>=top;i--){
                    mat[i][left]= a++;
                }
                //corss out the left boundary, so left++
                if (++left > right) break;
            }
            return mat;
        }
}
// @lc code=end

