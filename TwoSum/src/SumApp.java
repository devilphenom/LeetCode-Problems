import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array length : ");
		int nums[] = new int[scan.nextInt()];
		System.out.println("Enter "+nums.length+" values for the array : ");
		for(int i =0;i<=nums.length-1;i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Array Contents are : ");
		for (int i : nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the sum to find its numbers : ");
		int target = scan.nextInt();
		Sum sum = new Sum();
		int res[] = sum.twoSum(nums,target);
		for (int i : res) {
			System.out.print(i+",");
		}
		scan.close();
	}

}
