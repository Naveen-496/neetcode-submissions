class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while ( left <= right) {
            int mid = ( left + right ) / 2;
            // System.out.println(mid);
            int midElement = matrix[mid / cols][mid % cols];
              System.out.println("Mid Element " + midElement + " Mid " + mid +  " Left " + left + " Right " + right);
            if ( midElement == target) {
                return true;
            } else if ( midElement < target ) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
