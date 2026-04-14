class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const freq = {};
        for ( const n of nums ) {
            freq[n] = (freq[n] || 0 ) + 1; 
        }
        const res = [];
        for (const [num, f] of Object.entries(freq)) {
            res.push({ num, f});
            res.sort((a, b) => a.f - b.f);
            if ( res.length > k ) {
                res.shift();
            }
        }
        return res.map(r => r.num);
    }
}
