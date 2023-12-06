package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        /**
         * # 평균값 구하기
         * 정수를 입력하고 마지막에 0을 입력하세요
         * 1  2  0
         * 입력한 숫자는 2개 입니다.
         * 평균은 1입니다.
         * 정수를 입력하고 마지막에 0을 입력하세요
         * 12  438  99  20  0
         * 입력한 숫자는 4개 입니다.
         * 평균은 142입니다.
         * 정수를 입력하고 마지막에 0을 입력하세요
         * 78  992  77  1  29 39  59  0
         * 입력한 숫자는 7개 입니다.
         * 평균은 182입니다.
         *정수를 입력하고 마지막에 0을 입력하세요
         */
        Scanner sc = new Scanner(System.in);
        int sum =0, count = 0;
        //평균을 구하기 위한 합계 변수 sum 0; , 입력한 숫자 개수 count
        boolean x =  true;
        while (x){
            System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
            int num = sc.nextInt();
            // 반복 계속 숫자 입력받음
            if (num==0){  // 만약 입력받은 숫자가 0 이면
                x =false;    // 무한루프 false 
            }else {  // 0이 아니라면 
                sum += num;     // 받을 변수 sum에 받은 변수 num 더해주기
                count++;    // 다음 숫자가 들어와서 숫자 개수 더해주기
            }
        }
        int avg = sum/count;  // 받은 수 합 나누기 개수 평균 구하기
        System.out.println("입력한 숫자는 " + count + "입니다");
        System.out.println("평균은" + avg + "입니다");
    }
}
