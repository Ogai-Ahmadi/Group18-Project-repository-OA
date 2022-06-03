package group18.batch13;

public class OddEven2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task#4 Create a 2D array or integer type where you will store odd and even numbers.
		
		int [][] num = {{4,5,3},{6,2,3,7},{1,3,4,6}};
		
		//int odd[];
		//int even[];
	
		for (int i= 0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
				
				if(num[i][j] % 2== 0) {
					
					System.out.println("Even numbers" + num[i][j]);
						
				}else {
					
					System.out.println("Odd numbers" + num[i][j]);	
				}
			}
		}	
			
	}
		
}
