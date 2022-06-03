package group18.batch13;
import java.util.Scanner;
public final class Country {

	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub

Task#2 Using Scanner create an array of countries. When an array is created, 
retrieve all values from it and while retrieving those values print capital for each country.
 (use 2 different loops).
*/
		Scanner sc = new Scanner(System.in);
		String country[] = new String[3];
		String []capital= {"Kabul","DC","Delhi","Ankara"};
		
		for(int i=0; i<country.length; i++) {
			for(int j= 0; j<capital.length; j++) {
		System.out.println("Enter the country:");
		country[i] = sc.nextLine();
		
		if(country[i]=="Afghanistan") {
			
			capital[j]="Kabul";	
		}
			else if(country[i] == "USA") {
				capital[j]="DC";	
			}
			else if(country[i] == "India") {
				capital[j] = "Delhi";
			}
				System.out.println(country[i] + "capital is:" + capital[j]);
				
			}
		}sc.close();	
	}

}
