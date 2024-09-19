package Program;

public class ValueSum {
      public static void main(String[] args) {
    	  
    	  int indice  = 12, sum = 0, k = 1;
    	  
    	  while(k < indice) {
    		  k += 1;
    		  sum += k;	
    	  }
    	  System.out.println("Result of the sum: "+sum);
      }
}
