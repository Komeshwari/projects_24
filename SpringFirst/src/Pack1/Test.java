package Pack1;

public class Test {

	public static void main(String[] args) {
		BillCollector bc=new BillCollector();
		//setter injection calling
		//bc.setPayment(new CreditCardPayment());
		//bc.collectPayment(2000.20);
		//constructor injection calling
		BillCollector bc1=new BillCollector(new DebitCardPayment());
		bc1.collectPayment(2000.2);

	}

}
