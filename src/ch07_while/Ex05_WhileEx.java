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
        int a=0,   count=0;
        boolean w = true;
        while(w){
            System.out.println("숫자를 입력하세요");
            a=sc.nextInt();
            count++;
            if (num==a){
                System.out.println("정답 입니다.");
                System.out.println(count + "트 성공!");
            } else if (num<a) {
                System.out.println("더 작은 수 입니다");
            }else {
                System.out.println("더 큰 수 입니다");
            }
        }
    }
}
