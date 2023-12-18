package ch11_array.Ex05;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MemberServeice memberServeice = new MemberServeice();

        while (true) {
            System.out.println("---------------");
            System.out.println("1. 회원가입 | 2. 로그인 | 3.회원 목록 조회 | 4. 회원 정보 수정 | 5. 회원 탈퇴 | 6. 로그아웃"); 
            System.out.println("---------------");
            int sel = sc.nextInt();

            if (sel==1){
            memberServeice.signUp();
            } else if (sel==2) {
            memberServeice.logIn();
            } else if (sel==3) {
            memberServeice.findAll();
            }else if (sel==4) {
            memberServeice.upDate();
            } else if (sel==5) {
                memberServeice.withDraw();
            } else if (sel==6) {
            memberServeice.logOut();
        } else  {
                break;
            }
        }
    }
}
