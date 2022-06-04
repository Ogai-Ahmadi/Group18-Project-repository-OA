package group18.batch13;

import java.util.Arrays;

public class Max2NumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10.	Write a java program to find the second largest number in the array
		int array[]= {2,3,4,6,70,78,56,23,75,77};
		
		/*int max = array[0];
		int max2 = array[0];
		for(int i=1; i<array.length-1; i++) {
			
			if(array[i]>max) {
				max = array[i];
			}
		for(int j=1;j<array.length-1; j++) {
			if ( array[j]<max && array[j]>array[i]) {
				max2 = array[j];
			}
		}
			
		}System.out.println("second maximum number in the array is " + max2);*/
		Arrays.sort(array);
		int i;
		for(i=0; i<array.length-2; i++) {
			
		
		}System.out.println(array[i]);

	}

}
