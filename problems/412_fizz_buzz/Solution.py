# Author: Román
# GitHub profile: https://github.com/RomanKornyeyev

class Solution():
    def fizzBuzz(self, n):
        # Create an empty list to store the FizzBuzz results
        arr = []

        # Iterate from 0 to n and check if the number is divisible by 3, 5...
        for i in range(1, n + 1):
            if i % 3 == 0 and i % 5 == 0:
                arr.append("FizzBuzz")
            elif i % 3 == 0:
                arr.append("Fizz")
            elif i % 5 == 0:
                arr.append("Buzz")
            else:
                arr.append(f"{i}")
            
        return arr