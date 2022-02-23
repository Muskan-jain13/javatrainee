package thread;

public class TestJoin extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread 1");
		}
	}

	public static void main(String[] args) {
		

	}

}
