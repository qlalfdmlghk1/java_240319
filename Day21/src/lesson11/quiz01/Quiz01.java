package lesson11.quiz01;

public class Quiz01 {

	public static void main(String[] args) throws InterruptedException {
		ThreadImplements ani1 = new ThreadImplements("어흥");
		ThreadImplements ani2 = new ThreadImplements("음메~");
		ThreadImplements ani3 = new ThreadImplements("히잉");
		
		Thread t1 = new Thread(ani1);
		Thread t2 = new Thread(ani2);
		Thread t3 = new Thread(ani3);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
	}

}
