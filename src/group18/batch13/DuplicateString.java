package group18.batch13;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11.Write a program to print out duplicate elements from an Array of Strings?
		String array[]= {"ab","cd","ab","ef","gh","cd"};
		
		for(int i=0 ;i<array.length-1;i++) {
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i].equals(array[j])&& i!=j) {
					System.out.println("Duplicate vales are: " +array[j]);	
					
				}
			}
		}
		
		

	}

}
