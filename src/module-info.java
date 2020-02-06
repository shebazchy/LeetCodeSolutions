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
	    public ListNode reverseList(ListNode head) {
	         ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	    }
	    public void setZeroes(int[][] matrix) {
	        int R = matrix.length;
	        int C = matrix[0].length;
	        Set<Integer> rows = new HashSet<Integer>();
	        Set<Integer> cols = new HashSet<Integer>();
	        
	        for (int i = 0; i < R; i++) {
	          for (int j = 0; j < C; j++) {
	            if (matrix[i][j] == 0) {
	              rows.add(i);
	              cols.add(j);
	            }
	          }
	        }

	        for (int i = 0; i < R; i++) {
	          for (int j = 0; j < C; j++) {
	            if (rows.contains(i) || cols.contains(j)) {
	              matrix[i][j] = 0;
	            }
	          }
	        }
	    }
	    public int maxDepth(TreeNode root) {
	        if(root == null){
	            return 0;
	        }
	        int leftDepth = maxDepth(root.left);
	        int rightDepth = maxDepth(root.right);
	        
	        return Math.max(leftDepth, rightDepth) + 1;
	    }
	    public int maxProfit(int prices[]) {
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length - 1; i++) {
	            for (int j = i + 1; j < prices.length; j++) {
	                int profit = prices[j] - prices[i];
	                if (profit > maxprofit)
	                    maxprofit = profit;
	            }
	        }
	        return maxprofit;
	    }
}