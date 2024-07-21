package evenandodd;

public class sharedPrinter extends Thread {
	boolean oddStatus=false;
	synchronized void printOdd(int oddNumber) throws InterruptedException {
		// TODO Auto-generated method stub
		while(oddStatus) {
			wait();
		}
		System.out.println(Thread.currentThread()+" "+oddNumber);
		oddStatus=true;
		Thread.sleep(1000);
		notify();
	}

	synchronized void printEven(int oddNumber) throws InterruptedException {
		// TODO Auto-generated method stub
		while(!oddStatus) {
			wait();
		}
		System.out.println(Thread.currentThread()+" "+oddNumber);
		oddStatus=false;
		Thread.sleep(1000);
		notify();
	}

}
