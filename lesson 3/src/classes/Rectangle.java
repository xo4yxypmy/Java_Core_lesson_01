package classes;

public class Rectangle {

	private int width;
	private int height;
	
	Rectangle (){
		this.width = 10;
		this.height = 5;
	}
	
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}

	public int sqaure() {
		return Math.round(this.width * this.height);
	}
	
	public int perymetr() {
		return Math.round(this.width + this.height + this.width + this.height);
	}
}
