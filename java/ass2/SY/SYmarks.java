package SY;

public class SYmarks{
	public int Ctotal,Mtotal,Etotal;
	public int total;

	public SYmarks(){
		this.Ctotal=0;		
		this.Mtotal=0;
		this.Etotal=0;
		this.total=0;
	}

	public SYmarks(int c, int m,int e){
		this.Ctotal=c;		
		this.Mtotal=m;
		this.Etotal=e;
		this.total=c+m+e;
	}

	public void display(){
		System.out.println("Comp::" + Ctotal + "\t"  + "Maths::" + Mtotal + "\t" +"Elec::" + Etotal );
	}
	
}