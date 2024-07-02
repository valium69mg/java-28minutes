package udemyJavaCourse;
// extends thread
class Task1 extends Thread {
	public void run() { // SIGNATURE
		
		System.out.println("\nTask1 Started");
		for (int i = 100; i < 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}
// implements runnable
class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int i = 200; i < 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}
}
public class IntroToThreads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//task1
		System.out.println("\nTask1 kick started");
		Task1 task1 = new Task1();
		task1.start();
		
		
		System.out.println("\nTask2 kick started");
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();
		
		// WAIT FOR TASK 1 TO COMPLETE
		task1.join();
		
		System.out.println("\nTask3 kick started");
		System.out.println("\nTask3 Started");
		for (int i = 300; i < 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		
		
	}

}
