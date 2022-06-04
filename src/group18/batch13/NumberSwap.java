package group18.batch13;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to swap 2 numbers without a temporary variable?
		
		int num1 =4;
		int num2 = 5;
		System.out.println(num1+" "+num2);
		
		num1= num1 - num2;
		num2 = num1 + num2;
		num1= num2 - num1;
		
		System.out.print(num1 + " " + num1);

	}

}
