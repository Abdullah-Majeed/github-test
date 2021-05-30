import java.util.Scanner;

public class RollNoPower extends Thread {
	Scanner scanner = new Scanner(System.in);
	public void run() {
//		System.out.println("Enter the first non zero digit of your roll no: ");
//		int firstNonZeroDigitRollNo = scanner.nextInt();
		int firstNonZeroDigitRollNo=2;
		
		for(int i=1; i<=firstNonZeroDigitRollNo;i++) {
			 System.out.println(firstNonZeroDigitRollNo+"^"+i+"="+(int)Math.pow(firstNonZeroDigitRollNo, i));
		}
		

	}
}