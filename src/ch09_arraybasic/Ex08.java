package ch09_arraybasic;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */
        int[] num = new int[5];
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("입력하세요");
//            int ans = sc.nextInt();
//            num[i] = ans;
            num[i]=sc.nextInt();
            if (max < num[i]) {
                max=num[i] ;
            }
        }
        System.out.println(max);
    }}
