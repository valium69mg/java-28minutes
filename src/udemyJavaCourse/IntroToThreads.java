package udemyJavaCourse;
// extends thread
class Task1 extends Thread {
	public void run() { // SIGNATURE
		
		System.out.println("\nTask1 Started");
		for (int i = 0; i < 101; i++) {
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
		for (int i = 101; i < 201; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}
}
public class IntroToThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//task1
		System.out.println("\nTask1 kick started");
		Task1 task1 = new Task1();
		task1.start();
		
		
		System.out.println("\nTask2 kick started");
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();
		
	}

}
