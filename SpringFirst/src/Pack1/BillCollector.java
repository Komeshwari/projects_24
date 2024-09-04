package Pack1;

public class BillCollector {
private IPayment payment;
//setter injection
public void setPayment(IPayment payment)
{
	this.payment=payment;
}
public BillCollector()
{
	
}
//constructor injection
public BillCollector(IPayment payment)
{
	this.payment=payment;
}
//poymorphism implemmented here
public void collectPayment(double amount)
{
	String pay = payment.pay(amount);
	System.out.println(pay);
}
}
