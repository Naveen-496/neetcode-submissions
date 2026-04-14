class Solution {
    public int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;
        while ( left <= right ) {
            if ( nums[left] <= nums[right]) {
                return nums[left];
            }
            int mid = ( left + right ) / 2;
            if( nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return 0;

        // int left = 0, right = nums.length;
        // while ( left <= right ) {
        //     int mid = ( left + right ) / 2;
        //     if ( nums[mid] == target ) {
        //         return true;
        //     } else if ( nums[mid] < target ) {
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }
        // return false;
        
    }
}
