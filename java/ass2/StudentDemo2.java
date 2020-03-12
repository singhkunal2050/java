import java.util.Scanner;
import SY.SYmarks;
import TY.TYmarks;


class Student{
	public int roll;
	public String name;
	public SYmarks sm;
	public TYmarks tm;
	public char grade;


	public Student(){
		this.roll=0;
		this.name="demo";
		this.sm = new SYmarks();
		this.tm = new TYmarks();
		this.grade='-';
	}

	public Student(int r,String n,SYmarks s, TYmarks t){
		this.roll=r;
		this.name=n;
		this.sm = s;
		this.tm = t;
		this.grade=calculateGrade(this);
	}

	public String toString(){
		return this.roll + "\t" + this.name + "\t" + this.grade;
	}

	public static char calculateGrade(Student S){
		float avg = (float)(S.sm.total + S.tm.total)/5;				// out of 500 
			
		System.out.println("Avg ::" + avg);	

		if(avg>70)
			return 'A';
		else if(avg>60)
			return 'B';
		else if(avg>40)
			return 'C';
		else
			return 'E';
	}

} 



public class StudentDemo2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[]  S = new Student[10];
		String n;
		int r;
		SYmarks s;
		TYmarks t;

		System.out.println("Enter the number");
		int c = sc.nextInt();

		for(int i=0;i<c ;i++){
			System.out.println("Enter the name");
			n = sc.next();

			System.out.println("Enter the roll");
			r = sc.nextInt();

			System.out.println("Enter SYmarsk Comp Math Elec");
		 	s = new SYmarks(sc.nextInt(),sc.nextInt(),sc.nextInt());

			System.out.println("Enter TYmarsk Theory Pract");
			t = new TYmarks(sc.nextInt(),sc.nextInt());
			
			S[i] = new Student(r,n,s,t);
			
		}

		System.out.println("Roll\t Name\t Grade");
		for(int i=0; i<c;i++)
			System.out.println(S[i].toString());
	
	}
	


}