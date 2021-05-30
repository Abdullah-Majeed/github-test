public class Main extends Thread {
	public void run() {
		
		for (int i = 0; i < 26; i++) {
			try {
				sleep(1000);
				double randomNmber = 65 + (Math.random() * 25);
				int no= (int) randomNmber;
				char alphabet = (char) no;
				System.out.println(alphabet);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Main t1 = new Main();
		Main t2 = new Main();
		t1.start();
        t2.stop();  
        System.out.println("Thread t2 is stopped");    

		
	}
}
