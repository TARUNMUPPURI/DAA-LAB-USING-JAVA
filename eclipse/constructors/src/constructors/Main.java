package constructors;
class Account
{
	private double balance=0;
	public void debit(double amount)
	{
		if(amount<=balance && amount>0)
		{
		balance -= amount;
		}
	}
	public void credit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
		}
	}
	public void print() {
		System.out.println("Current account balance is "+balance);
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1;
		a1 = new Account();
		a1.credit(10256);
		a1.debit(1000);
		a1.print();
	}

}
