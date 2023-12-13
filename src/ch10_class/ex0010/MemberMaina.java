package ch10_class.ex0010;

import ch10_class.ex0010.Membera;

import java.util.Scanner;

public class MemberMaina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Membera mb = new Membera();
        Membera mb2 = new Membera();
        System.out.println("----------");
        System.out.println("1. 회원 가입 | 2. 로그인 | 3. 종료 ");
        System.out.println("----------");
        int sel = sc.nextInt();
        while(true){
            if (sel==1){
                System.out.println("가입하실 Email을 적어주세요");
                mb.setMemberEmail(sc.next());
                System.out.println("가입하실 비밀번호를 적어주세요");
                mb.setMemberPassword(sc.next());
                System.out.println("가입하실 이름을 적어주세요");
                mb.setMemberName(sc.next());
                System.out.println("가입하실 전화번호를 적어주세요");
                mb.setMemberMobile(sc.next());
            } else if (sel==2) {
                System.out.println("로그인 이메일 : ");
                String id = sc.next();
                System.out.println("로그인 비밀번호");
                String pw = sc.next();
//                boolean check =
                }
            else{
                break;
            }
        }




    }


}
