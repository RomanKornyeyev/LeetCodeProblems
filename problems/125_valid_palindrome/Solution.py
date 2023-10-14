# Author: Román
# GitHub profile: https://github.com/RomanKornyeyev

import re

class Solution(object):
    def isPalindrome(self, s):
        res = True

        # Remove non-alphanumeric characters
        # Convert the string to lower case and remove the spaces from the start and end
        s = re.sub("[^a-zA-Z0-9]", "", s)
        s = s.lower().strip()

        # Check if it is a palindrome by comparing characters from the start and end
        if len(s) > 0:
            for i in range(0, (len(s) // 2) + 1):
                if s[i] != s[len(s) - 1 - i]:
                    res = False # If they don't match, change the result to false
        
        return res