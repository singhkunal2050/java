import java.io.*;
import java.util.*;

interface CreditCardInterface
{
	public void viewCreditAmt();
	public void useCard(double d);
	public void payCredit(double d);
	public void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface
{
	String cname;
	long cno;
	double creditAmt;
	double creditlimit;
	SilverCardCustomer()
	{
		creditAmt=0;
		creditlimit=50000;
	}
	SilverCardCustomer(String cname,long cno)
	{
		this.cname=cname;
		this.cno=cno;	
	}
	public void viewCreditAmt()
	{
		System.out.println("CreditAmount:\t"+creditAmt);
	}
	public void useCard(double d)
	{
		if(creditAmt<creditlimit)
		{
			creditAmt=creditlimit+d;
			System.out.println("Credit Updated.");
		}
		else
			System.out.println("Cannot Increase.");
	}
	public void payCredit(double d)
	{
		creditAmt=creditAmt-d;
		System.out.println("Credit Amount Updated.");
	}
	public void increaseLimit()
	{
		System.out.println("Silver Card Customer cannot increase limit.");
	}	
}	

class GoldCardCustomer extends SilverCardCustomer				
{
	static int count;
	GoldCardCustomer()
	{
		creditAmt=0;
		creditlimit=100000;
	}
	GoldCardCustomer(String c,long n)
	{
		super(c,n);
	}

	public void increaseLimit()
	{
		if(count<=3)
		{
			creditlimit=creditlimit+5000;
			count++;
		}
		else
 			System.out.println("Now you cannot increase limit.");
	}
}

class TestCard
{
	public static void main(String g[])throws IOException
	{
		int ch,ch1,n;
		String name,cardno;
		double x1,y;
		SilverCardCustomer sc=new SilverCardCustomer();
		GoldCardCustomer gc=new GoldCardCustomer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of cardholders:\t");
		n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name:\t");
			name=br.readLine();
			System.out.println("Enter card no:\t");
			cardno=br.readLine();
		}		
		do
		{	
			System.out.println("\n1.SilverCard Customer\n2.GoldCard Customer");
			System.out.println("Enter card type:\t");
			ch1=Integer.parseInt(br.readLine());	
	            	System.out.println("\n1.ViewAmt\n2.IncreaseLimit\n3.PayCredit\n4.Usecard");
	
			System.out.println("Enter your choice:\t");
			ch=Integer.parseInt(br.readLine());
			
			
			switch(ch)
			{
				case 1:if(ch1==1)
					sc.viewCreditAmt();
					else
					gc.viewCreditAmt();
					break;
					
				case 2:if(ch1==1)
					sc.increaseLimit();
					else
					gc.increaseLimit();
					break;
					
				case 3:System.out.println("\nEnter Amount:\t");
					x1=Double.parseDouble(br.readLine());
					if(ch1==1)
					sc.payCredit(x1);
					else
					gc.payCredit(x1);
					break;
					
				case 4:System.out.println("\nEnter Amount:\t");
					y=Double.parseDouble(br.readLine());
					if(ch1==1)
					sc.useCard(y);
					else
					gc.useCard(y);
					break;
				
				case 5:System.exit(0);
			}
		}while(ch!=5);
	}
}

