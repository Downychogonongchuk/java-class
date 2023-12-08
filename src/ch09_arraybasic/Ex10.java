package ch09_arraybasic;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 숫자의 크기를 갖는 배열을 만들자
         * 예 5를 입력하면 크기가 5인 배열이 만들어져야 함
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력");
        int b = sc.nextInt();
        int [] a= new int[b];
        System.out.println(a.length);

        System.out.println("");

    }
}
