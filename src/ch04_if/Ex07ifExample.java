package ch04_if;

import java.util.Scanner;

public class Ex07ifExample {


	public static void main(String[] args) {
		// 성적 출력 예제 응용
		// 입력값 : 학년 (year), 점수 (score)
		//처리 
		// 1~3학년은 60점 이상이면 합격
		// 4학년은 70점 이상이어야 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력하세요");
		int year = sc.nextInt();
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
//		if (year==4) {
//			if (score>70) {
//				System.out.println("합격입니다.");
//			}else {
//				System.out.println("불합격입니다. ");
//			}
//		}
//			
//			if (year==1 || year==3) {
//				if (score>60) {
//					System.out.println("당신에게 주어진 합격목걸이");
//				}else {
//					System.out.println("불합격입니다.");
//				}
//			}
//		
//			if (year == 4) {
//				if (score >= 70) {
//					System.out.println("합격");
//				} else {
//					System.out.println("불합격");
//				}
//			} else if (year <= 3) {
//				if (score >= 60) {
//					System.out.println("합격");
//				} else {
//					System.out.println("불합격");
//				}
//			}
//			
			
//			if (year==4 && score > 70) {
//				if (score>70) {
//					System.out.println("합격입니다.");
//				}else {
//					System.out.println("불합격입니다.");
//				}
//			}else if(year==1 || year==3) {
//				if (score>60) {
//					System.out.println("합격입니다.");
//				}else {
//					System.out.println("불합격입니다.");
//				}
//			}
			
		if (year==4 && score > 70) {
			System.out.println("합격입니다.");
			}else if(year==1 || year==3) {
			if (score>60) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			} // 왜 else 가 중첩 없이 뒤로 빠졌지...?
		}
			
			
			
			
			
			
			
			

	
		}
		}	
	
	
	
