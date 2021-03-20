import java.util.Scanner;
public class reverseint2 {

	
		public static int reverse(int x) {
			
			long res = 0;
			        while (x != 0) {
			            res = res * 10 + x % 10;
			            x = x / 10;
			        }
			        
			        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) 
			            return 0;
			         else 
			            return (int)res;
			        
		}			
			    
		public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be reversed :");
		int k= sc.nextInt();
		System.out.println(" "+ reverse(k));	
		


	}}

