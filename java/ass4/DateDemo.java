import java.util.*;

class InvalidDateException extends Exception{

	InvalidDateException(){
		System.out.println("Invalid Date!!");
	}
}


class MyDate{
	private int dd,mm,yy;
	public static boolean set=true;

	public MyDate(){
		this.dd=0;
		this.mm=0;
		this.yy=0;
	}

	public MyDate(int d,int m,int y){
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}

	public void accept(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter Year");
			int y = sc.nextInt();
			if(y>5000 || y<1)
				throw new InvalidDateException();
			System.out.println("Please Enter Month");
			int m = sc.nextInt();
			if(m>12 || m<1)
				throw new InvalidDateException();
			System.out.println("Please Enter Date");
			int d = sc.nextInt();
			if(m==1 || m==3 ||m==5 ||m==7 || m==8 || m==10 || m==12) {
				if(d>31 || d<1)
					throw new InvalidDateException();
			}
			else if(m==4 || m==6 || m==9 || m==11){
				if(d>30 || d<1)
					throw new InvalidDateException();
			}
			else{
				if(d>28 || d<1)
					throw new InvalidDateException();
			}
			this.yy=y;
			this.mm=m;	
			this.dd=d;

		}catch(Exception e){
			this.set=false;			//date not set
			System.out.println("Date Not Saved Exception Caught :: " + e);
		}
	}

	public void display(){
		if(set)
			System.out. println("The date is :: "+ dd+"/"+mm+"/"+yy);
	}
}


public class DateDemo{
	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.accept();
		d1.display();
	}
}