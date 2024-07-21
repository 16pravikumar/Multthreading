package evenandodd;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sharedPrinter sharePrinter=new sharedPrinter();
		
		oddnumber oddNum=new oddnumber(10, sharePrinter);
		oddNum.setName("Odd-Thread");
		
		evennumber evenNum=new evennumber(10, sharePrinter);
		evenNum.setName("Even-Thread");
		
		oddNum.start();
		evenNum.start();
		
	}

}
