package classes;

public class Circle_Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle ();
		System.out.println("����� ����� = " + c1.sqaure() + ";");
		System.out.println("������� ���� = " + c1.lenght() + ";");
		
		System.out.println();
	
		Circle c2 = new Circle (10.2);
		System.out.println("����� ����� = " + c2.sqaure() + ";");
		System.out.println("������� ���� = " + c2.lenght() + ";");
	}
	
}
