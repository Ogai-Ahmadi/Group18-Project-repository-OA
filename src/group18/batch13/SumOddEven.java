package group18.batch13;

public class SumOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  5.	Create a 2D array of integers.
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		int array[] = {2,3,4,6,8,7,1,9,2,1};
		
		
		int evensum =0;
		int oddsum =0;
				for(int i=0 ; i<array.length; i++) {
					
					if(array[i] % 2 == 0) {
						evensum+=array[i];
						
					}else {
						oddsum+=array[i];
					}
				}System.out.println("Sum of even number is: "+ evensum);
				System.out.print("Sum of odd number is: " + oddsum);

	}

}
