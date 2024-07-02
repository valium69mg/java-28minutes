package udemyJavaCourse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LessonExcecutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SINGLE THREAD EXECUTION
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// TASK FROM INTRO TO THREADS
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		
		System.out.println("\nTask3 kick started");
		System.out.println("\nTask3 Started");
		for (int i = 300; i < 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		
		executorService.shutdown();
		
	}

}
