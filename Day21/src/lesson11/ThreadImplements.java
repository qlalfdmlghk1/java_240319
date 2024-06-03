package lesson11;

public class ThreadImplements implements Runnable{
	
	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		// 여기서 구현하는 내용이 쓰레드에서 수행된다.
		for (int i = 0; i < 10; i++) {
			System.out.println(this.resource);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
