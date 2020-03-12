/// Max manager


import java.util.Scanner;

class Employee{
	private int id;
	protected int sal;
	private String name , dept;

	public Employee(){
		this.id=this.sal=0;
		this.name=this.dept="NA";
	}

	public Employee(int i , String n , String d  , int s){
		this.id=i;
		this.sal=s;
		this.name=n;
		this.dept=d;
	}

	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id sal name dept");
		this.id=sc.nextInt();
		this.sal=sc.nextInt();
		this.name=sc.next();
		this.dept=sc.next();
	}


	public void display(){
		System.out.print(" ID " + this.id + " Name " + this.name + " Dept " + this.dept + " Sal " + this.sal  );
	}

}

class Manager extends Employee{
	private int bonus;

	public Manager(){
		super();
		this.bonus=0;
	}

	public Manager(int i , String n , String d  , int s, int b){
		super();
		this.bonus=b;
	}

	public void accept(){
		Scanner sc = new Scanner(System.in);		
		super.accept();
		System.out.println("Enter the bonus");
		this.bonus=sc.nextInt();
	}

	public void display(){
		super.display();
		System.out.println(" Bonus " + this.bonus + " Total " + this.getTotal());
	}

	public int getSal(){
		return this.sal;
	}

	public int getBonus(){
		return this.bonus;
	}

	public int getTotal(){
		return this.sal + this.bonus ;
	}

	public static int findMax(Manager M[],int c){
		int k=0;
		int temp=-1;

		for(int i=1;i<=c;i++)
			if((M[i].getSal()+M[i].getBonus())>temp){
				temp=M[i].getSal()+M[i].getBonus();
				k=i;
			}	
		return k;	
	}
}


public class EmployeeDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager[] M = new Manager[10];
		
		System.out.println("Enter the count of Manager");		
		int c =sc.nextInt();

		for(int i=1 ; i<=c ; i++){
			M[i] = new Manager();
			M[i].accept();
		}

		for(int i=1 ; i<=c ; i++)
			M[i].display();
		
		int max=Manager.findMax(M,c);
		System.out.println("Richest Manager");		
		M[max].display();
	}
}