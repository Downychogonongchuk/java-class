package ch05_for;

public class Ex01_for {
    public static void main(String[] args) {
        // for([반복 변수]; [반복조건]; [반복변수증감식] ) {
        // 반복하여 실행할 문장

        // 1부터 10까지 출력
        for (int i = 1; i <=10; i++) {
            // soutv 바로 직전에 찍어 본 값 프린트
            System.out.println("i = " + i);
            System.out.println(i);
            }
        int j =0; // j 라는 변수 선언
        for ( j=0; j<3; j++){  // 중복 선언 불가
            System.out.println("j = " + j);
        }
        System.out.println("반복문 종료 후 j = " + j );

        }
    }

