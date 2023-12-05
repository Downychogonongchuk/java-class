package ch06_for;

import java.util.Scanner;

public class Ex10_For2 {
    public static void main(String[] args) {
        /**
         * 정수 하나를 입력 받고
         * 1부터 입력받은 정수까지의 정수 중에서
         * 23의 배수의 배수,를 제외한 수의 총 합 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i%2!=0 && i%3!=0){
                System.out.println("i =" + i);
                 sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}