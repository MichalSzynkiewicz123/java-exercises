import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

class PaymentAmount {
	
	 	public static void main(String args[]){
	 		
	 		double amount = 0;
	 		double payments = 0;
	 		Scanner scaner = new Scanner(System.in);
	 	    gettingInput(amount, payments, scaner);
	   }

		private static void gettingInput(double amount, double payments, Scanner scaner) {
			try {
	 	    	// get  amount as a float
	 	    	while(amount <= 0) {
	 	    		 //  prompt for the amount
	 		 	    System.out.print("Enter Total amount: ");
	 		 	    amount = scaner.nextDouble();
	 	    	}
	 	    	while(payments <=0) {
		 	    	// prompt for their age
		 	 	    System.out.print("Enter no of payments: ");
		 	 	    // get the payments as an float
		 	 	    payments = scaner.nextDouble();
	 	    	}
	 	    	//calculating regular and last amount
	 	 	    recurringPay(amount, payments);
	 	 	    
	 	    }catch(InputMismatchException e) {
	 	    	System.out.println("Wrong input");
	 	    }catch(Exception e) {
	 	    	System.out.println(e);
	 	    }
		}

		private static void recurringPay(double amount, double payments) {
			
		 	//BigDacimal is recommended to calculate currencies and it is easy to round floating point numbers
			BigDecimal recPay = new BigDecimal(amount/payments);
			recPay =recPay.setScale(2, BigDecimal.ROUND_DOWN);
			
			double pay = recPay.doubleValue();
	 	    
			if((pay * payments) == amount) {
	 	    	System.out.println("Regular amount  "+  recPay);
	 	    }else {
	 	    	System.out.println("Regular amount  "+  recPay);
	 	    	
	 	    	//Calculating the last payment  
	 	    	recPay = new BigDecimal (pay + (amount - (pay*payments)));
	 	    	
	 	    	System.out.println("Last amount  "+ recPay.setScale(2, BigDecimal.ROUND_UP));
	 	    	
	 	    }
		}
    
}