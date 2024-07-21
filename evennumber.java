package evenandodd;

public class evennumber extends Thread {
	private int limit;
	private sharedPrinter sharePrinter;
	public evennumber(int limit, sharedPrinter sharePrinter) {
		super();
		this.limit = limit;
		this.sharePrinter = sharePrinter;
	}
	public void run() {
		int evenNumber=2;
		while(evenNumber<=limit) {
			try {
				sharePrinter.printEven(evenNumber);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			evenNumber=evenNumber+2;
		}
	}

}
