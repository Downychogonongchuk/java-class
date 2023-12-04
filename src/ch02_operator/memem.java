package ch02_operator;

public class memem {

	public static void main(String[] args) {
		//산술 연산자
				// num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로 
				// 두 변수의 +-*/% 연산결과를 print()를 활용하여 출력해봅시다.
				//System.out.println(num1 + num2);
				
				int num1 = 71, num2 = 24;
				
				int sum1 = num1 + num2,  sum2 = num1 - num2;
				int sum3 = num1 * num2,  sum4 = num1 / num2;
				int sum5 = num1 % num2;
				
				
				System.out.println(sum1 + "\n"+ sum2 + "\n" + 
				sum3 + "\n" + sum4 + "\n" + sum5);

	}

}
