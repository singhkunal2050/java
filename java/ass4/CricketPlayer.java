import java.io.*;

class MyException1 extends Exception
{
	public MyException1()
	{
		System.out.println("No. of notout cannot be greater than noofinnings");
	}
}

class MyException2 extends Exception
{
	public MyException2()
	{
		System.out.println("Innings cannot be less than zero");
	}
}

class MyException3 extends Exception
{
	public MyException3()
	{
		System.out.println("Runs cannot be negative");
	}
}

class MyException4 extends Exception
{
	public MyException4()
	{
		System.out.println("N cannot be negative");
	}
}

class CricketPlayer
{
	String name;
	int noofinnings,nooftimesnotout,totalruns;
	float batavg;
	public CricketPlayer()
	{
	}
	public static void sortPlayer(CricketPlayer player[])
	{

	CricketPlayer temp;
	for(int i=0;i<player.length;i++)
	{
		for(int j=i+1;j<player.length;j++)
		{
			if(player[i].batavg>player[j].batavg)
			{
				temp=player[i];	
				player[i]=player[j];
				player[j]=temp;
			}
		}
	}
	}


	public static void avg(CricketPlayer players[])
	{
		for(int i=0;i<players.length;i++)
		{
			players[i].batavg=players[i].totalruns/players[i].noofinnings;
		}	
	}

	public void accept()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter Player Name:\t");
			name=br.readLine();
			
			System.out.println("Enter Number of Innings:\t");
			noofinnings=Integer.parseInt(br.readLine());
			if(noofinnings<=0)
				throw new MyException2();
			
			System.out.println("Enter Total Runs:\t");
			totalruns=Integer.parseInt(br.readLine());
			if(totalruns<0)
				throw new MyException3();
			
			System.out.println("Enter No. of times NotOut:\t");
			nooftimesnotout=Integer.parseInt(br.readLine());
			if(nooftimesnotout>noofinnings)
				throw new MyException1();
			}
		
		catch(MyException1 mee)
		{	
		}
		catch(MyException2 mee)
		{	
		}
		catch(MyException3 me)
		{	
		}
	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		CricketPlayer players[];
		System.out.println("How many players do you want?:\t");
		try
		{
			int n=Integer.parseInt(br.readLine());
			if(n<0)
				throw new MyException4();
			else
			{
				players=new CricketPlayer[n];
				for(int i=0;i<n;i++)
				{
					players[i]=new CricketPlayer();
					players[i].accept();
				}
				CricketPlayer.avg(players);
				System.out.println("\n------------------------------------------------------------------------------");
				System.out.println("Name\t\tInnings\t\tRuns\t\tNotOut\t\tBattingAvg.");
				for(int i=0;i<players.length;i++)
				{
					System.out.print(players[i].name+"\t\t"+players[i].noofinnings+"\t\t");
					System.out.print(players[i].totalruns+"\t\t"+players[i].nooftimesnotout+"\t\t");	
					System.out.println(players[i].batavg);
				}			
				
				CricketPlayer.sortPlayer(players);
				System.out.println("\n------------------------------------------------------------------------------");
				System.out.println("Name\t\tInnings\t\tRuns\t\tNotOut\t\tBattingAvg.");
				for(int i=0;i<players.length;i++)
				{
					System.out.print(players[i].name+"\t\t"+players[i].noofinnings+"\t\t");
					System.out.print(players[i].totalruns+"\t\t"+players[i].nooftimesnotout+"\t\t");	
					System.out.println(players[i].batavg);
				}
			}
		}
		catch(MyException4 meee)
		{	
		}
	}
}
