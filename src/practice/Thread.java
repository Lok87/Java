package practice;

public class Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		  Thread obj = new Thread();
		    Thread thread = new Thread();
		    thread.start();
		    System.out.println("This code is outside of the thread");
		  }
		  private void start() {
		// TODO Auto-generated method stub
		
	}
		public void run() {
		    System.out.println("This code is running in a thread");
		  }
		}
	
	
	
	
	
	
	
	
