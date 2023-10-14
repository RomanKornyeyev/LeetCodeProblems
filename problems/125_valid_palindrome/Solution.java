/**
 * Two sum solution
 * @author Román
 * @see {@link https://github.com/RomanKornyeyev} - GitHub profile
 */

class Solution {
    public boolean isPalindrome(String s) {
        //for default, the answer is true
        boolean answer = true;
		
        //lower case, remove the lateral spaces, remove all non-alphanumeric characters
		s = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
		
        //if the length is 0, it returns true, otherwise it check the string
        //compare for extreme characters, going towards the center
        if(s.length() > 0)
		    for(int i=0, j=s.length(); i<((s.length()/2)+1); i++, j--)
	 		    if(!s.substring(i, i+1).equals(s.substring(j-1, j)))
	 			    answer = false;
	 			
		return answer;
    }
}