package thread;

public class JavaJoin extends Thread {
	public void run() {
		try {
		for(int i=0;i<=5;i++) {
			System.out.println("child thread"+i);
			
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}



	

	public static void main(String[] args)throws InterruptedException {
		JavaJoin obj=new JavaJoin();
		obj.start();
		obj.join();
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("main thread"+i);
				
					Thread.sleep(1000);
				}
			}catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}

		
		
	}


