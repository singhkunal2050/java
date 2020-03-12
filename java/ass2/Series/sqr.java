package Series;

public class sqr{
	public int ans;

	public sqr(){
		this.ans=0;		
	}

	public sqr(int n){
		for(int i=1;i<=n;i+=1)
			System.out.print(Math.sqrt(i) + "\t");
		System.out.println();
	}

}