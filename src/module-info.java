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
	   public int climbStairs(int n) {
	        return climb_Stairs(0, n);
	    }
	    public int climb_Stairs(int i, int n) {
	        if (i > n) {
	            return 0;
	        }
	        if (i == n) {
	            return 1;
	        }
	        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
	    }
	    public int[] twoSum2(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }
	            map.put(nums[i], i);
	        }
	        return null;
	    }
}