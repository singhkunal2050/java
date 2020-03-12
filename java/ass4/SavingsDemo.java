import java.util.Scanner;

class InsufficientFundsException extends Exception{

	public InsufficientFundsException(){
		System.out.println("The balace in less!!");
	}
}


class SavingsAccount{
	private int acno,bal;
	private String name;
	static int minBalance=500;

	 public SavingsAccount(){
	 	this.acno=0;
	 	this.bal=0;
	 	this.name="NA";
	 }

	 public SavingsAccount(int a,int b,String n){
	 	this.acno=a;
	 	this.bal=b;
	 	this.name=n;
	 }

	 public void withdraw(){
	 	try{
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter Amount to withdraw :: " );
		 	int a = sc.nextInt();
		 	if((this.bal-a)<500)
		 		throw new InsufficientFundsException();
		 	this.bal = this.bal-a;
		 	System.out.println("Amount Withdrawn ! Balance Updated to :: "+ this.bal);
		 }catch(InsufficientFundsException e){
		 	System.out.println("Exception Caught :: "+ e);
		 }
	}

	 public void deposit(){
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter Amount to deposit :: " );
	 	int a = sc.nextInt();
 	 	this.bal = this.bal+a;
	 	System.out.println("Amount deposited ! Balance Updated to :: "+ this.bal);
	 }

	 public void viewBalance(){
	 	System.out.println("Your balace is :: " + this.bal);
	 }	 

}


public class SavingsDemo{
	public static void main(String[] args) {
		SavingsAccount A = new SavingsAccount(10001,1000,"Kunal");
		A.withdraw();
		A.deposit();
		A.withdraw();

		A.viewBalance();
	}
}