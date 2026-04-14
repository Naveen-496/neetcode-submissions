class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        const map = {};
        for ( const c of s ) {
            map[c] = (map[c] || 0) + 1;
        }
        for ( const c of t) {
            map[c] = (map[c] || 0) - 1;
        }
        for ( const v of Object.values(map)) {
            if ( v !== 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param {string} s
     * @return {string}
     */
    sorted(s) {
        return s.split('').sort((a, b) => a.localeCompare(b)).join('');
    }
}
