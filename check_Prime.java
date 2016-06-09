import java.util.Scanner;
public class check_Prime {
	private static Scanner input;
	public static void prime(int n) {
		
		        boolean isPrime = true;
		        for (int i = 2; i < n; i++) {
		            if (n % i == 0) {
		                isPrime = false;
		                break;
		            }
		        }
		        if (isPrime) {
		           System.out.println(n + " IS A PRIME NUMBER");
		        } else {
		
		            System.out.println(n + " IS NOT A PRIME NUMBER");
		
		        }
		
		    }
	public static void main(String[] args) {
		
		int number;
		input = new Scanner(System.in);
		System.out.println("Enter the Number:" );  
		number = input.nextInt();
		prime(number);
	}
}
