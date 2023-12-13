package ch10_class.ex10;

import java.util.Objects;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Member mem1 = null;
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int sel;
        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.회원가입 2.로그인 3.종료");
            System.out.println("--------------------------");
            System.out.print("번호를 입력하세요 > ");
            sel = sc.nextInt();
            if (sel == 1) {
                mem1 = new Member();
                System.out.println("--------------------------");
                System.out.println("Sign Up!!");
                System.out.println("--------------------------");
                System.out.print("이메일 입력 > ");
                mem1.setMemberEmail(sc.next());
                System.out.print("비밀번호 입력 > ");
                mem1.setMemberPassword(sc.next());
                System.out.print("이름 입력 > ");
                mem1.setMemberName(sc.next());
                System.out.print("전화번호 입력 > ");
                mem1.setMemberMobile(sc.next());
            } else if (sel == 2) {
                System.out.println(Objects.requireNonNull(mem1).memberLogin(mem1.getMemberEmail(), mem1.getMemberPassword()));
            } else if (sel == 3) {
                run = false;
            }
        }
    }
}