package ch09_arraybasic;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수 값 을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합. 평균 계산
         */
        Scanner sc = new Scanner(System.in);
        int asb = 0,   sum=0;
        // 입력 받을 변수 asb , 합계 변수 sum
        int[] num = new int[3];
        //  크기가 3인 정수형 배열 num
        //        int[] num2 = {1,2,3,4};
        for (int i = 0; i < num.length; i++){
            asb = sc.nextInt();  // num[i] = sc.nextint();
             num[i] =asb;  // 배열num의 i번째에 입력받은 값 대입
            //for문이 돌아가는 동안 계속 i는 증가하고
            // num[i] 배열의 크기가 끝날 때까지 순서대로 대입
            sum += num[i]; // 합계변수 sum에 배열 값 하나씩 더해짐
        }
        int avg = sum/ num.length;  // 평균 avg 는 합계 sum 나누기 배열길이
        System.out.println(avg);
    }


    }




