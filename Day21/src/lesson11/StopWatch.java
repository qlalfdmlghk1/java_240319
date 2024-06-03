package lesson11;

public class StopWatch extends Thread {
    private boolean stop; // stop flag
    private int seconds;

	@Override
    public void run() {
        while (!stop) {  // false 일 때 수행, true가 될 때 끝
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			this.seconds++;
        }
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    
    public int getSeconds() {
    	return this.seconds;
    }
}