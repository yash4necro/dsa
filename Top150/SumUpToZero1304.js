/**
 * @param {number} n
 * @return {number[]}
 */
var SumUpToZero1304 = function(n) {
    let resultArr = [];
    if (n % 2 !== 0) {
        resultArr.push(0);
    }
    for (let i = 1; i <= n/2; i++) {
        resultArr.push(i);
        resultArr.push((-1)*i);
    }
    return resultArr;
};