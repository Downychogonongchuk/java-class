package ch04_if;

import java.util.Scanner;

public class Ex08_ifExample {

	public static void main(String[] args) {
		// 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기 
		// 같은 숫자는 입력하지 않는다고 가정
		// 입력 예 # 첫번째 숫자 : # 두번째 숫자: # 세번째 숫자:
		
		// 출력 예 # 가장 큰 숫자는 00 입니다.
		// 1번 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요");
		int num3 = sc.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("가장 큰 숫자는"+ num1 +"입니다.");
			}else {
				System.out.println("가장 큰 숫자는"+ num3+"입니다.");
			}
		}else if(num2>num1) {
			if (num2>num3) {
				System.out.println("가장 큰 숫자는"+num2+"입니다.");
			}else {
				System.out.println("가장 큰 숫자는"+num3+"입니다.");
			}
		}
		
		// 2번
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째숫자: ");
		int sum1 = scanner.nextInt();
		System.out.print("두번째숫자: ");
		int sum2 = scanner.nextInt();
		System.out.print("세번째숫자: ");
		int sum3 = scanner.nextInt();
		
		int max = 0;
		if (sum1 > sum2) {
			if (sum1 > sum3) {
				max = sum1;
			} else { //else if (sum1 < sum3)
				max = sum3;
			}
		} else  { //else if (sum1 < sum2)
			if (sum2 >sum3) {
				max = sum2;
			} else  { //else if (sum2 < sum3)
				max = sum3;
			}
		}
		System.out.println("가장 큰 숫자는 "+ max +" 입니다.");
		
		// 3번 
		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수는 " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수는" + num2);
		}else if (num3 > num1 && num3 > num2){
			System.out.println("가장 큰 수는 " + num3);
		}
		
		// 4번 
		int a = 0;
		if (num1 > num2) {
			if(num1 > num3) {
				max = num1;
			}else {
				max = num3;
			}
		}else {
			if (num2 > num3){
				max = num2;

			}
			System.out.println(max);
		}

		
		
		
		
		
		
		

	}

}
