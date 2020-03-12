abstract class Shape{

	public int r;
	public int l,b,h;
	public double area,volume;

	public void calArea(){
	}

	public void calVolume(){
	}

	public void display(){
	}

}

class Sphere extends Shape{

	public Sphere(int r){
		this.r = r;
	}

	public void calArea(){
		this.area=4* Math.PI * this.r *this.r; 
	}

	public void calVolume(){
		this.volume= (4/3)*Math.PI* this.r *this.r; 
	}

	public void show(){
		System.out.println("Area of Sphere :: " + (float)this.area + " Volume of Sphere :: " + (float)this.volume);
	}

}


class Cylinder extends Shape{

	public Cylinder(int h,int r){
		this.r = r;
		this.h = h;
	}

	public void calArea(){
		this.area= 2*Math.PI * this.r* this.r*this.h;
	}

	public void calVolume(){
		this.volume= Math.PI * this.r * this.r*this.h;
	}

	public void show(){
		System.out.println("Area of Cylinder :: " + (float)this.area + " Volume of Cylinder :: " + (float)this.volume);
	}

}


class Cone extends Shape{

	public Cone(int h,int r){
		this.r = r;
		this.h = h;
	}

	public void calArea(){
		this.area= (float)1/3*Math.PI * this.r* this.r*this.h;
	}	

	public void calVolume(){
		this.volume= Math.PI * this.r*this.h;
	}

	public void show(){
		System.out.println("Area of Cone :: " + (float)this.area + " Volume of Cone :: " + (float)this.volume);
	}

}



public class ShapeDemo{
	public static void main(String[] args) {
		Sphere s1 = new Sphere(4);
		s1.calArea();	s1.calVolume();
		s1.show();

		Cylinder c1 = new Cylinder(4,2);
		c1.calArea();	c1.calVolume();
		c1.show();

		Cone c2 = new Cone(2,4);
		c2.calArea();	c2.calVolume();
		c2.show();
		
	}
}