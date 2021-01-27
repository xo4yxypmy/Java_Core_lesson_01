package classes;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle(){
		this.radius = 9.3;
		this.diameter = 2 * this.radius;	
	}
	
	Circle (double radius){
		this.radius = radius;
		this.diameter = 2 * this.radius;	
	}
	
	public double sqaure() {
		return Math.round(0.25 * (this.diameter * this.diameter) * Math.PI);
	}
	
	public double lenght() {
		return Math.round((2 * this.radius * Math.PI));
	}
}
