package day22_NestedLoop;

public class WarmUp {
	public static void main(String[] args) {
		int number = 1;
		String str = "";
		while (number <= 30) {
			/*
			if (number%3==0 && number%5 == 0) {
				str += "FINRA ";
			}else if (number%3 == 0) {
				str += "FIN ";
			}else if (number%5 == 0) {
				str += "RA ";
			}else {
				str += number + " ";
			}
			*/
			str += (number%3==0 && number%5 == 0)?"FINRA ":(number%3 == 0)?"FIN "
					:(number%5 == 0) ? "RA ": number + " ";
			
		    number++;
		}
		System.out.println(str);
	}

}
