package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		
		byte u = -21;
		short s = 1028;
		int a = 21;
		long b = 40;
		float f = 69f;
		double d = 90d;
		boolean c = false;
		
		byte res1 = u;
		short res2 = s;
		int res3 = a + a;
		long res4 = a + b;
		float res5 = f + a;
		double res6 = d + b;
		boolean res7 = !c;
		
		System.out.println("byte = "+ res1);
		System.out.println("short = "+ res2);
		System.out.println("int = "+ res3);
		System.out.println("long = "+ res4);
		System.out.println("float = "+ res5);
		System.out.println("double = "+ res6);
		System.out.println("boolean = "+ res7);
		
		System.out.println();
		
		Byte u1 = 30;
		Short s1 = 2000;
		Integer a1 = 808;
		Long b1 = 566L;
		Float f1= 980.5F;
		Double d1 = 44.12D;
		Boolean c1 = true;
		
		System.out.println("Min Byte = " +Byte.MIN_VALUE);
		System.out.println("Max Byte = " +Byte.MAX_VALUE);
		System.out.println("Min Short = " +Short.MIN_VALUE);
		System.out.println("Max Short = " +Short.MAX_VALUE);
		System.out.println("Min Integer = " +Integer.MIN_VALUE);
		System.out.println("Max Integer = " +Integer.MAX_VALUE);
		System.out.println("Min Long = " +Long.MIN_VALUE);
		System.out.println("Max Long = " +Long.MAX_VALUE);
		System.out.println("Min Float = " +Float.MIN_VALUE);
		System.out.println("Max Float = " +Float.MAX_VALUE);
		System.out.println("Min Double = " +Double.MIN_VALUE);
		System.out.println("Max Double = " +Double.MAX_VALUE);
		System.out.println("Min Boolean = " +c1);
		System.out.println("Max Boolean = " +!c1);
		
		int [] array1 = new int [10];
		array1[0] = 10;
		array1[1] = 54;
		array1[2] = 60;
		array1[3] = 2;
		array1[4] = -12;
		array1[5] = 9;
		array1[6] = 99;
		array1[7] = 64;
		array1[8] = 35;
		array1[9] = 44;
		int min, max;
		min = max = array1[0];
		for (Integer i = 1; i <10; i++) {
			if(array1[i] < min)
				min = array1[i];
			if(array1[i] > max)
				max = array1[i];
			}
		System.out.println("Min value = " + min + " " + "Max value = " + max);
				
		int [] array2 = {5,6,8,-9,1,29,33,12,0,-5};
		int min1, max1;
		min1 = max1 = array2[0];
		for (Integer i = 1; i <10; i++) {
			if(array2[i] < min1)
				min1 = array2[i];
			if(array2[i] > max1)
				max1 = array2[i];
			}
		
		System.out.println("Min value = " + min1 + " " + "Max value = " + max1);
	};
}
	

