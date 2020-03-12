import java.util.Random;


class Student{
	public int roll;
	public String name;
	public float percent;

	public static int count=0;


	public Student(){
		this.roll=0;
		this.name="demo";
		this.percent=0;
		count++;
	}

	public Student(int r,String n , float p){
		this.roll=r;
		this.name=n;
		this.percent=p;
		count++;
	}

	public String toString(){
		return this.roll + "\t" + this.name + "\t" + this.percent;
	}

	public static void getCount(){
		System.out.println("The count :: "+ count);
	}

	public static void sortStudent(Student S[]){

		for(int i=1;i<count;i++){
				for(int j=0;j<count-i; j++){
					Student t = new Student();
					count--;				// temporary obj are not actual studs

					if(S[j+1].percent>S[j].percent){
						t=S[j+1];
						S[j+1]=S[j];
						S[j]=t;
					}

				}
		}
		System.out.println("--------------------SORTED--------------------");
	}

} 

public class StudentDemo{
	public static void main(String[] args) {

		Student[] S = new Student[100]; 
		int i=0;
		Random r = new Random();

		for(i=0; i<100;i++)
			S[i] = new Student(i,"ksr" + i,r.nextInt(800)%100);
	/*
		for(i=0; i<100;i++)
			System.out.println(S[i].toString());
	*/
		for(Student t : S)
			System.out.println(t.toString());

		Student.getCount();
		Student.sortStudent(S);

		for(Student t : S)
			System.out.println(t.toString());
		
		Student.getCount();


		
	}
}
