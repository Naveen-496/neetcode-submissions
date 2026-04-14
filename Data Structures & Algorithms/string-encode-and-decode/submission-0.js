class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        // 4#neet4#code4#love3#you
        let sizes = [];
        for ( const s of strs ) {
            sizes.push(s.length);
        }
        let res = '';
        for ( let sz of sizes ) {
            res += sz + ','
        }
        res += '#';
        for ( let s of strs ) {
            res += s;
        }
        return res;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        console.log(str);
        const sizes = [];
        let ind = 0, res = [];
        while ( str[ind] !== '#') {
            let num = '';
            while ( str[ind] !== ',') {
                num += str[ind];
                ind++;
            }
            sizes.push(parseInt(num));
            ind++;
        }
        ind++;
        console.log(sizes);
        for ( let sz of sizes ) {
            res.push(str.substring(ind, ind + sz));
            ind += sz;
        }
        return res;
    }
}
