public class ThreadEx1 {
	public static void main(String[] args) {
//		ThreadEx1_1 t1 = new ThreadEx1_1();
//		
//		Thread t2 = new Thread(new ThreadEx1_2());
//		
//		t1.start();
//		t2.start();
		
	}
	

}

class ThreadEx1_1 extends Thread {
	@Override
	public void run() { // 쓰레드가 수행할 작업을 작성
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx1_2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}
	
}

