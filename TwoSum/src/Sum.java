
public class Sum {
	public int[] twoSum(int[] nums, int target) {
		int res[] = new int[2]; 
		for(int i=0;i<=nums.length-1;i++) {
			for(int j = nums.length-1;j>i;j--) {
				if(nums[i]+nums[j] == target) {
					res[0] = i;
					res[1] = j;
					return res;
					
				}
			}
		}
		return res; 
    }
}
