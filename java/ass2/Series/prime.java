package Series;

public class prime{
	public double ans;

	public prime(){
		this.ans=0;		
	}

	public prime(int n){
		int flag=0;
		for(int i=1;i<=n;i++){
			flag=0;
			for(int j=2;j<i/2 ; j++){
				if(i%j!=0)
					break;
				else
					flag=1;	
			}
			if(flag==1)
				System.out.print(i + "\t");
		}
		
	}

}