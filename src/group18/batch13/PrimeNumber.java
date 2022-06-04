package group18.batch13;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		//
		//7.	Write a java program to check whether a given number is prime or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to see if it is prime number");
		int number = sc.nextInt();
		
		if(number>1 && number%1==0 && number%number ==0) {
		
		System.out.println("The number you have entered a prime number");
		
		}
		else {
			System.out.println("The number you have entered is NOT a prime number");
			
		}


	}

}
