package group18.batch13;

public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.	Write a Java Program to print the first 10 numbers of Fibonacci series.
		//int array[]= {0,1, 2, 3,4 ,5 ,6,7,8,9,10};
		/*for(int i = 1; i< array.length; i++) {
			array[i] = array[i] + array[i-1];
			System.out.println(array[i]);*/
		
		int num1=0,num2=1, num3;
		System.out.print(num1 +" "+num2+" ");
		for(int i = 0; i<=10;i++) {
		 num3 = num1 + num2;
		 System.out.print(num3+" ");
		 
		 num1=num2;
		 num2=num3;
		 
		}
		
			
		
			}
		
	}


 
