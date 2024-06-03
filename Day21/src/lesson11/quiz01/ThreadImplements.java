package lesson11.quiz01;

public class ThreadImplements implements Runnable{

private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		// 여기서 구현하는 내용이 쓰레드에서 수행되는 내용
		
		// resource 10번 출력
		for(int i = 0; i < 5; i++) {
			System.out.println(this.resource);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 0.3초씩 쉰다.
		}
	}
}
