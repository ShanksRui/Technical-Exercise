
package Program;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter the number:");
	int number = sc.nextInt();
	if(FiborIs(number)){	
		System.out.println("belongs to the Fibonacci sequence.");
	}else {
		System.out.println("does not belong to the Fibonacci sequence.");
	}
}
public static boolean FiborQ(int number) {
    	 int x = (int) Math.sqrt(number);
    	 return Math.pow(x, 2) == number;
   }
public static boolean FiborIs(int number) {
	 return FiborQ(5 * number * number + 4)|| FiborQ(5* number * number - 4);

}
 }
