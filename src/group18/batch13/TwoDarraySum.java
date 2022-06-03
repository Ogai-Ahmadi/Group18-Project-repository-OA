package group18.batch13;

public class TwoDarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task# 3.	Create a 2D array of integer values. Print the sum of all numbers.
		int sum=0;
		int [][] num = {{2,3,4,5},{6,7,3,4,0},{2,4,3,1}};
		
		for(int i=0;i < num.length; i++) {
			for(int j =0; j< num[i].length; j++) {
				
				sum += num[i][j];
			}
			
		}System.out.println(sum);
	}

}
