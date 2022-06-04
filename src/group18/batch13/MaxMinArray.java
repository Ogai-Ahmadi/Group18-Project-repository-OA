package group18.batch13;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9.	Maximum and minimum number in the array?
		int array[]= {2,3,4,6,78,56,23};
		int max = array[0];
		int min = array[0];
		for(int i=1; i<array.length-1; i++) {
			
			if(array[i]>max) {
				max = array[i];
			}
			
			else {
				array[i]=min;
			}
		}System.out.println("Maximum number in the array is " + max);
		System.out.println("Minimum number of the array is " + min);

	}

}
