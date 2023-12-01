package ch02;

import java.util.Scanner;

public class Ex06Scanner {

	public static void main(String[] args) {
		// 정수를 입력받아 num1 이라는 변수에 저장
		// 우변: scanner 클래스 객체가 가지고 있는 nextInt() 메서드를 호출
		// 좌변: 호출결과를 num1에 대입
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		
	}

}
