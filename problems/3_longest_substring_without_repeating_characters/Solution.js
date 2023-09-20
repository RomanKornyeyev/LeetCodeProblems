/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let max = 1;
    
    if(s === "") return 0;

    for(let i = 0; i < s.length; i++){
        let streak = 1;
        let actual = [];
        actual.push(s.charAt(i));

        for(let y = i + 1; y < s.length; y++){
            if(!actual.includes(s.charAt(y))){
                streak = streak + 1;
                actual.push(s.charAt(y));
            }else{
                break;
            }
        }
        if (streak > max) max = streak;
    }

    return max;
};