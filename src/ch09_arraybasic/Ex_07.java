package ch09_arraybasic;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        /**
         * 거스름돈 계산하기
         * 필여한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         *  170원 이라고 입력하면
         *  100원 1개
         *  50원 1개
         *  10원 2개
         *
         *  780원
         *  500원 1개
         *  100원 2개
         *  50원 1개
         *  10원 3개
         *  
         */
        Scanner sc = new Scanner(System.in);
        int[] coin = {500,100,50,10};

        System.out.println("거스름돈을 입력해주세요");
        int pay=sc.nextInt();
        int sum = 0;
        for (int i=0; i< coin.length;  i++){
//                sum = pay/coin[i];
//            sum += pay%coin[i];
            System.out.println(pay/coin[i]);
                pay= pay %coin[i];
            }
        }
    }

