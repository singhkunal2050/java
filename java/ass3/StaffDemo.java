import java.io.*;
import java.util.*;

abstract class Staff
{
	String name;
	String addr;
	abstract void show();
}

class FullTime extends Staff
{
	String dept;
	float salary;
	FullTime()
	{
		dept="";
		salary=0;
	}
	FullTime(String nm,String adr,String dpt,float sal)
	{
		super.name=nm;
		super.addr=adr;
		dept=dpt;
		salary=sal;
	}
	
	void show()
	{
		System.out.println("\nFullTime Staff Details:");
		System.out.println("\nName=>"+name);
		System.out.println("\nAddress=>"+addr);
		System.out.println("\nDepartment=>"+dept);
		System.out.println("\nSalary=>"+salary);
	}
}

class HalfTime extends Staff
{
	int noofhours;
	float rateperhour;
	HalfTime()
	{
		noofhours=0;
		rateperhour=0;
	}
	HalfTime(String nm,String adr,int n,float rate)
	{
		super.name=nm;
		super.addr=adr;
		noofhours=n;
		rateperhour=rate;
	}
	
	void show()
	{
		System.out.println("\nHalfTime Staff Details:");
		System.out.println("\nName=>"+name);
		System.out.println("\nAddress=>"+addr);
		System.out.println("\nNumber of hours=>"+noofhours);
		System.out.println("\nRate per hour=>"+rateperhour);
	}
}

class StaffDemo
{
	public static void main(String args[])throws IOException
	{
		String nm,adr,dpt;
		int ch,lim,n,i;
		float rate,sal;
		System.out.print("Enter Limit :: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		lim=Integer.parseInt(br.readLine());
		do
		{
			System.out.println("\n1.FullTimeStaff\n2.HalfTimeStaff\n3.Exit");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{	
				case 1:FullTime F[]=new FullTime[lim];
					for(i=0;i<F.length;i++)
					{
						System.out.println("\nEnter Name: ");
						nm=br.readLine();
						System.out.println("\nEnter Address: ");
						adr=br.readLine();
						System.out.println("\nEnter Dept.: ");
						dpt=br.readLine();
						System.out.println("\nEnter Salary: ");
						sal=Float.parseFloat(br.readLine());
						F[i]=new FullTime(nm,adr,dpt,sal);
						F[i].show();
					}
					break;
				
				case 2:	HalfTime P[]=new HalfTime[lim];
					for(i=0;i<P.length;i++)
					{
						System.out.println("\nEnter Name: ");
						nm=br.readLine();
						System.out.println("\nEnter Address: ");
						adr=br.readLine();
						System.out.println("\nEnter No. of hours: ");
						n=Integer.parseInt(br.readLine());
						System.out.println("\nEnter Rate: ");
						rate=Float.parseFloat(br.readLine());
						P[i]=new HalfTime(nm,adr,n,rate);
						P[i].show();
					}
					break;
					
				case 3:
					System.exit(0);
			}
		}while(ch!=3);
	}
}
