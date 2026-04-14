class Solution {
    public int findMin(int[] nums) {

        int min = nums[0];
        if ( nums.length == 1) return min;

        for (int num: nums) {
            if ( num < min ) min = num;
        }

        return min;

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
