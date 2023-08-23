import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Palindrome palindrome =new Palindrome();
		System.out.println(palindrome.isPalindrome(scan.nextInt()));
		scan.close();

	}
	 public boolean isPalindrome(int x) {
		 
		 int rem = 0;
		 int rev = 0;
		 while(x!=0) {
			 rem = x%10;
			 rev = (rev*10)+rem;
			 x=x/10;
		 }
		 System.out.println("oreginal : "+x);
		 System.out.println("reverse : "+rev);
		 if(x == rev) {
			 if(x>=0)
			 return true;
		 }
		 return false;
	 }

}
