package thread;
class MyException extends Thread{
	public void run()
	{
		try {
		for(int i=0;i<=3;i++) {
			System.out.println(i);
			
				Thread.sleep(2000);
		}
			} catch (Exception e) {
				System.out.println("InterruptedException occur"+e);
				
			}
	}
}
class MyException1 extends Thread{
	public void run()
	{
		try {
		for(int i=0;i<=3;i++) {
			System.out.println(i);
			
				Thread.sleep(2000);
		}
			} catch (Exception e) {
				System.out.println("InterruptedException occur"+e);
				
			}
	}
}

public class JavaInterrupt {

	public static void main(String[] args) {
		MyException obj=new MyException();
		MyException1 obj1=new MyException1();
		
		obj.start();
		obj.interrupt();
		obj1.start();
		obj1.interrupt();
		
		
		

	}

}
