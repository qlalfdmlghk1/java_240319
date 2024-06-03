package lesson11;

public class ThreadExtends extends Thread{
	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		// 여기서 구현하는 내용이 쓰레드에서 수행되는 내용
		
		// resource 10번 출력
		for(int i = 0; i < 10; i++) {
			System.out.println(this.resource);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 0.3초씩 쉰다.
		}
	}
}
