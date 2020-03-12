package Series;

public class fibo{
	public double ans;

	public fibo(){
		this.ans=0;		
	}

	public fibo(int n){

		int f1=0,f2=1;
		int sum;

		if(n==1)
			System.out.print(f1);
		if(n==2)
			System.out.print(f1 + "\t" + f2);
		else if(n>2){
			System.out.print(f1 + "\t" + f2+ "\t");
			for(int i=0;i<n-2;i++)
			{
				sum=f1+f2;
				System.out.print(sum + "\t");
				f1=f2;
				f2=sum;
			}
		}
		System.out.println();
	}

}