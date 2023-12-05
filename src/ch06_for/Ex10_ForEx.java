package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {
        /**
         * 정수 하나를 입력 받고
         * 1부터 입력받은 정수까지의 정수 중에서
         * 23의 배수의 배수,를 제외한 수의 총 합 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();
        int i =1;
        for ( i=1; i<=num; i++){
            for(int k=0; k<=num; k+=2){
                for (int p=0; p<=num; p+=3){
                    if (i !=k || i!=p){
                        System.out.println(i);
                    }
                }
            }
        }
        System.out.println(i);
    }
}
