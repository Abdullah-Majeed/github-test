import java.util.Scanner;

public class RollNoFactorial extends Thread {
	Scanner scanner = new Scanner(System.in);

	public void run() {
//		System.out.println("Enter the first non zero digit of your roll no: ");
//		int firstNonZeroDigitRollNo = scanner.nextInt();
		int firstNonZeroDigitRollNo=2;
		
        for(int i = firstNonZeroDigitRollNo-1; i >= 1; i--)
        {
        	System.out.println(firstNonZeroDigitRollNo+"*"+i+"="+firstNonZeroDigitRollNo*i);
        	firstNonZeroDigitRollNo=firstNonZeroDigitRollNo*i;
         }
		
        
    }
		     
		 }   

	

