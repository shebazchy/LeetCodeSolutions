class Solution {
	   public int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    return  null;
	}
	   public int getSum(int a, int b) {
	        while (b != 0){
	            int sum = a & b;
	            a = a ^ b;
	            b = sum << 1;
	        }
	        return a;
	    }
}