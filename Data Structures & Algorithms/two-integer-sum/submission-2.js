class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        // brute forece is that we loop thorough the arr 
        // and add two elements and compare it with target
        const sumMap = {};
        for (let i = 0; i < nums.length; i++) {
            const rem = target - nums[i];
            if (sumMap[rem] !== undefined) {
                return [sumMap[rem], i];
            }
            console.log(sumMap, rem, sumMap[rem]);
            sumMap[nums[i]] = i;
        }
        // for ( let i = 0; i < nums.length; i++) {
        //     for ( let j = i + 1; j < nums.length; j++) {
        //         const sum = nums[i] + nums[j];
        //         if ( sum === target) {
        //             return [i, j];
        //         }
        //     }
        // }
        return [-1, -1];
    }
}
