package ch07_while;

import java.util.Scanner;

public class Ex08_While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  deposit= 0,    withdraw= 0,  balance= 0;
    while(true){
        System.out.println("-----------------------");
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
        System.out.println("-----------------------");
        int ans = sc.nextInt();
        if (ans==1){
            System.out.println("예금하실 금액을 입력하세요");
            deposit=sc.nextLong();
            balance += deposit;
        }else if (ans==2){
            System.out.println("출금하실 금액을 입력하세요");
            withdraw=sc.nextLong();
            if (balance<withdraw){
                System.out.println("잔액이 부족합니다.");
                System.out.println("대출 상품을 알아보시려면 013-442-11로 문의 주세요");
            }else {
                balance-=withdraw;
            }
        }else if (ans==4){
            break;
        }else {
            System.out.println("고객님의 잔액 조회 결과");
        }
        System.out.println("현 잔액은"+ balance+"입니다.");
    }
    }
}
