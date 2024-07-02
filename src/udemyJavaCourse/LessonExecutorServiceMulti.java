package udemyJavaCourse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	
	private int number;
	
	public Task(int number) {
		this.number = number;
	}
	
	
	public void run() { // SIGNATURE
		
		System.out.println("\nTask" + number + " Started");
		for (int i = this.number*100; i < 100*this.number + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask" + this.number + " Done");
	}
}

public class LessonExecutorServiceMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ONLY 2 THREADS AT THE TIME
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//  THREADS
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));

		
		
		executorService.shutdown();
				
	}

}
