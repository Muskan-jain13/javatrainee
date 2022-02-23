package thread;

class R implements Runnable {
	public void run() // running state
	{
		System.out.println("thread is in running state");
	}
}

class S implements Runnable {
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

class T implements Runnable {
	public void run() {
		System.out.println("Thread g is running");
	}
}

public class MultiThreadingDemo {
	public static void main(String[] args) {
		//E e1=new E();         //new born state
		Thread t1 =new Thread(new R());
		Thread t2 = new Thread(new S());
		Thread t3=new Thread(new T());
		t1.start();
		t2.start();
		t3.start();
	}		
}

