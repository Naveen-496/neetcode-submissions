class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        const sSorted = this.sorted(s);
        const tSorted = this.sorted(t);
        console.log({ sSorted, tSorted});
        return this.sorted(s) === this.sorted(t);
    }

    /**
     * @param {string} s
     * @return {string}
     */
    sorted(s) {
        return s.split('').sort((a, b) => a.localeCompare(b)).join('');
    }
}
