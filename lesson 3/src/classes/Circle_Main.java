package classes;

public class Circle_Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle ();
		System.out.println("Площа круга = " + c1.sqaure() + ";");
		System.out.println("Довжина кола = " + c1.lenght() + ";");
		
		System.out.println();
	
		Circle c2 = new Circle (10.2);
		System.out.println("Площа круга = " + c2.sqaure() + ";");
		System.out.println("Довжина кола = " + c2.lenght() + ";");
	}
	
}
