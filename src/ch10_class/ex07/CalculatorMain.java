package ch10_class.ex07;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈
         * 각 번호를 선택하면  Calculator 클래스에 있는 해당 메서드 실행
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("1. 더하기 | 2. 빼기 | 3. 곱하기 | 4. 나누기");
        System.out.println("--------------------");
        int calNum = sc.nextInt();
        Calculator ca = new Calculator();

        while (true) {
//            System.out.println("첫번째 숫자를 입력하세요");
//            int num1 = sc.nextInt();
//            System.out.println("두번째 숫자를 입력하세요");
//            int num2 = sc.nextInt();

            if (calNum == 1) {
                System.out.println("첫번째 숫자를 입력하세요");
                int num1 = sc.nextInt();
                System.out.println("두번째 숫자를 입력하세요");
                int num2 = sc.nextInt();

                System.out.println("덧셈 결과");
                ca.sum(num1, num2);
            }
            else if (calNum == 2) {
                System.out.println("첫번째 숫자를 입력하세요");
                int num1 = sc.nextInt();
                System.out.println("두번째 숫자를 입력하세요");
                int num2 = sc.nextInt();

                System.out.println("뺄셈 결과");
                ca.sub(num1, num2);
            }
           else if (calNum == 3) {
                System.out.println("첫번째 숫자를 입력하세요");
                int num1 = sc.nextInt();
                System.out.println("두번째 숫자를 입력하세요");
                int num2 = sc.nextInt();
                int result = ca.mul(num1, num2);
                System.out.println("곱셈 결과" + result);
            }
            else if (calNum == 4) {
                int result2 = ca.div();
                System.out.println("나눗셈 결과" + result2);
            } else {

                break;
            }
        }

    }
}
