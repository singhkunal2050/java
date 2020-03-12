package TY;

public class TYmarks{
	public int theory,pract;
	public int total;


	public TYmarks(){
		this.theory=0;		
		this.pract=0;
		this.total=0;	
	}

	public TYmarks(int t, int p){
		this.theory=t;		
		this.pract=p;
		this.total=theory+pract;	
	}

	public void display(){
		System.out.println("theory::" + theory + "\t"  + "pract::" + pract);
	}
	
}