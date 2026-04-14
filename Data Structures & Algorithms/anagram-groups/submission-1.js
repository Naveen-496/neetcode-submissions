class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const groupedAnagrams = {};
        for (const s of strs) {
            const groupKey = this.getGroupKey(s);
            if (!groupedAnagrams[groupKey]) {
                groupedAnagrams[groupKey] = [];
            }
            groupedAnagrams[groupKey].push(s);
        }
        return Object.values(groupedAnagrams);
    }

    /**
     * @param {string} s
     * @return {string}
     */
    getGroupKey(s) {
        return s.split('').sort().join('');
    }
}
