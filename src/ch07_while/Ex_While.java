package ch07_while;

import java.util.Scanner;

public class Ex_While {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력
         */
        Scanner sc = new Scanner(System.in);
        int input = 0, count = 0;
        boolean run = true;
        System.out.println("up & down");
        int answer = (int) (Math.random()*100) + 1;
        while (run) {
            System.out.print("숫자를 입력하세요 :   ");
            input = sc.nextInt();
            count++;
            System.out.println("answer = " + answer);
            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요!");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            }else {
                System.out.println("맞았습니다.");
                System.out.println("시도 횟수는 " + count + "회 입니다.");
            }
        }

    }
}
