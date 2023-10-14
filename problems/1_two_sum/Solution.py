# Author: Román
# GitHub profile: https://github.com/RomanKornyeyev

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Iterate over pairs of indices in the input list nums
        for i in range (0, len(nums)):
            for j in range (i+1, len(nums)):
                # Check if the sum of the current pair of elements equals the target
                if nums[i] + nums[j] == target:
                    # Return the indices of the pair that satisfies the condition
                    return [i, j]
        # Return an empty list if no pair was found that sums up to the target
        return []