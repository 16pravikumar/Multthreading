package evenandodd;

public class oddnumber extends Thread {
	private int limit;
	private sharedPrinter sharePrinter;
	public oddnumber(int limit, sharedPrinter sharePrinter) {
		super();
		this.limit = limit;
		this.sharePrinter = sharePrinter;
	}
	public void run() {
		int oddNumber=1;
		while(oddNumber<=limit) {
			try {
				sharePrinter.printOdd(oddNumber);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			oddNumber=oddNumber+2;
		}
	}
	
	
}
