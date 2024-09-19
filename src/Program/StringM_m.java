package Program;

import java.util.Scanner;

public class StringM_m {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter text String");
	    String text = sc.nextLine();
	    int sum = 0;
	  
		for(int i = 0; i < text.length();i++) {
			char letter = text.charAt(i);	
			
			if(letter == 'a' ||letter =='A') {
				sum++;
			}
		}
		if (sum != 0) {
			System.out.println(" 'a/A' totalletter = "+sum);
		}else
			System.out.println(" 'a/A' not found in string!");
  }
}