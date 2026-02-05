package Numbers_Programs;

public class ReversNumbers {

	public static void main(String[] args) {
		      int num =12345;               //Input
		      int rev =0;                   //to store the rev number
		      while(num!=0) {
		    	  int digit = num%10;      //get last number
		    	  rev = rev*10+digit;      //Add number to rev
		    	  num = num/10;            //remove last number
		      }
		      System.out.println("Revers Number :" +rev);
	}

}
