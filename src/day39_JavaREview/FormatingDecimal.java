package day39_JavaREview;

import java.text.DecimalFormat;

public class FormatingDecimal {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.000");
		
		double b = 23.12345233231213;
		
		//format(double): formats the decimals and returns string value
		
		String num1 = format.format(b);
		System.out.println(num1);
		
		double c = 45.56729;
		System.out.println(format.format(c));
		
		c=Double.parseDouble(format.format(c));
		System.out.println(c+1);
	}
}
