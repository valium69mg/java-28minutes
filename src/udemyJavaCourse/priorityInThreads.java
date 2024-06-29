package udemyJavaCourse;
//extends thread
class Task3 extends Thread {
	public void run() { // SIGNATURE
		
		System.out.println("\nTask1 Started");
		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}
//implements runnable
class Task4 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int i = 101; i < 201; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}
}
public class priorityInThreads {
	public static void main(String[] args) {
		System.out.println("\nTask1 kick started");
		Task3 task3 = new Task3();
		task3.setPriority(10); // HIGHEST PRIORITY (NOT ALWAYS EXCECUTES, IT IS A REQUEST)
		task3.start();
		
		
		System.out.println("\nTask2 kick started");
		Task4 task4 = new Task4();
		Thread thread = new Thread(task4);
		thread.setPriority(1);
		thread.start();
	}
}
