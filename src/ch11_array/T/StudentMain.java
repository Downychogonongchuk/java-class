package ch11_array.T;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // StudentService 클래스 서비스 객체 선언
        StudentService studentService = new StudentService();

        while (true) {
            System.out.println("---------------");
            System.out.println("1. method1 호출 | 2. method2 호출 | 3.method3 호출 | 4. 종료");
            System.out.println("---------------");
            int sel = sc.nextInt();

            if (sel==1){
                System.out.println("메서드 호출 전");
                studentService.method1();
                System.out.println("메서드 호출 후");
            } else if (sel==2) {
                studentService.method2();
            } else if (sel==3) {
                studentService.method3();
            }else if (sel==4){
                break;
            }

        }
    }
}
