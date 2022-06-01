package group18.batch13;
import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task#1 Using Scanner create an array of integer values. After the array is created, 
		//calculate the sum of all stored elements in that array.
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to add?");
		
		int size = sc.nextInt();
		
		int array[]= new int[size];
		
		int sum = 0;
	
		System.out.println("Enter integer values you want to add ");
		for(int i =0; i<array.length; i++) {
		array[i]= sc.nextInt();
		sum+=array[i];
		}
		
		System.out.println("The sum of the numbers you have entered, is" + sum);
		sc.close();
		
	}

}
