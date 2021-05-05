
public class ThreadEx12 {

	public static void main(String[] args) {
		ThreadEx12_1 th1 = new ThreadEx12_1();
		ThreadEx12_2 th2 = new ThreadEx12_2();
		th1.start();
		th2.start();
		
		delay(2*1000);
		System.out.print("<<main ����>>");
		
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
		
	}
}

class ThreadEx12_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.print("-");
		System.out.print("<<th1 ����>>");
	}
}

class ThreadEx12_2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.print("|");
		System.out.print("<<th2 ����>>");
	}
}

