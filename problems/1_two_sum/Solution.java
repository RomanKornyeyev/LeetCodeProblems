class Solution {
    public int[] twoSum(int[] nums, int target) {
        //aux arr for outputs
        int indexes[] = new int[2];
		
        for(int i=0; i<nums.length-1; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		if((nums[i] + nums[j]) == target) {
            		indexes[0] = i;
            		indexes[1] = j;
            		break;
            	}
        	}
        }
        
        return indexes;
    }
}