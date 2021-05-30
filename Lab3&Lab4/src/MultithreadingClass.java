
public class MultithreadingClass {

	public static void main(String[] args) {
		RollNoFactorial rollNoFactorial = new RollNoFactorial();
		RollNoPower rollNoPower = new RollNoPower();
		rollNoFactorial.start();
		rollNoPower.start();

	}

}
