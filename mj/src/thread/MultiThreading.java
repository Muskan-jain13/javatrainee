package thread;

class E extends Thread {
	public void run() // running state
	{
		System.out.println("thread is in running state");
	}
}

class F extends Thread {
	public void run() {
		System.out.println("thread c is started");
		for (int i = 0; i <= 10; i++) {
			System.out.println("value of i in C" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread b is running");
	}
}

class G extends Thread {
	public void run() {
		System.out.println("Thread g is running");
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		E obj1 = new E(); // new born state
		F obj2 = new F();
		G obj3 = new G();
		obj1.start(); // runnable state
		obj2.start();
		obj3.start();

	}
}
