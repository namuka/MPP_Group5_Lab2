package prob3inherit;

public class Circle extends Cylinder {
	
	public Circle(double radius){
		super(radius);//error : more explained on error.txt
	}
	
	public double computeArea() {
		return getRadius() * getRadius() * Math.PI;
	}
}
	

	
	


