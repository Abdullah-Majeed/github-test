
public class AlphabetPrint extends Thread {
	public void run() {
		
		int i=1;
		do {
			try {
				sleep(3000);
				double randomNmber = (int) (65 + (Math.random() * 25));
				char alphabet = (char) randomNmber;
				System.out.println(alphabet);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			}
			while (i<=26);
	}
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		AlphabetPrint firstThread = new AlphabetPrint();
		AlphabetPrint secondThread = new AlphabetPrint();
		firstThread.start();
		secondThread.stop();  

		
	}
}
