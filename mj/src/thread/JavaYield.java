package thread;

public class JavaYield extends Thread {
	public void run() {
		//Thread.yield();    //if we want main thread to execute
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "-"+i);
		}
	}



	public static void main(String[] args) {
		JavaYield t1 = new JavaYield();
		t1.start();
		t1.yield();//if we want main method to stop and provide chance to other threads for execution.
		

		for (int i = 0; i < 3; i++) {
			
			System.out.println(Thread.currentThread().getName() + "-"+i);
		}

	}

}
