package classes;

public class Rectangle_Main {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		System.out.println("Площа прямокутника = " +r1.sqaure() + ";");
		System.out.println("Периметер прямокутника = " +r1.perymetr() + ";");
		
		System.out.println();
		
		Rectangle r2 = new Rectangle(50,10);
		System.out.println("Площа прямокутника = " +r2.sqaure() + ";");
		System.out.println("Периметер прямокутника = " +r2.perymetr() + ";");
	}
}
