package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()   *100)+1;
        // 랜덤 숫자 미리 지정 # 계속 숫자가 바뀌면 X
        int a=0,   count=0;
        // 스캐너로 받을 정수 값 변수 a , 시도 횟수 변수 count 미리 지정 
        // count 반복문에서 0으로 초기화 시 몇번을 시도해도 0으로 초기화
        boolean w = true;
        // boolean 타입 변수 w true  무한 루프 조건문에 넣을 변수 
        while(w){
            // while 조건문 true 로 무한루프 실행
            System.out.println("숫자를 입력하세요");
            // 계속 새로운 값 받아서 a에 대입
            a=sc.nextInt();
            count++;            // 횟수 카운트
            if (num==a){
                // if 조건 랜덤 지정된 num 의 값이 입력 받은 a값과 같을 시
                System.out.println("정답 입니다.");
                System.out.println(count + "트 성공!");
            } else if (num<a) {
                // 랜덤지정 값이 입력받은 a 보다 작으면
                System.out.println("더 작은 수 입니다");
            }else {
                System.out.println("더 큰 수 입니다");
            }
        }
    }
}
