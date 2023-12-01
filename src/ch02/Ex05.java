package ch02;

public class Ex05 {

	public static void main(String[] args) {
		// 증감연산자
		int num1 = 10, num2 = 0,  num3 = 0;
		System.out.println("num1:  " + num1 + "\t"+"num2:  " + num2 + "\t"+ "num3:  " + num3);
		num2 = ++num1;
		
		System.out.println("num1:  " + num1 + "\t"+ "num2:  " + num2 + "\t"+ "num3:  " + num3);
		num2 = ++num1;  
		
		num3 = num1++;   
		System.out.println("num1:  " + num1 + "\t"+ "num2:  " + num2 + "\t"+ "num3:  "+ num3);
		
		// ++ sum : 더한 후 대입 ,  // sum ++ 대입 후 연산
		
		int result1 = num1++   +  ++num2;
		System.out.println("num1: " + num1 +"\t"+ "num2: " + num2 +"\t"+ "num3: " + num3);
		System.out.println(result1);
		
	}

}
