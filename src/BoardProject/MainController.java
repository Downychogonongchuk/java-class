package BoardProject;

import BoardProject.service.BoardService;
import BoardProject.service.MemberService;
import p.ch_Package.Bank.BankService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        BoardService boardService = new BoardService();  
        MemberService memberService = new MemberService(); // 호출 할 서비스 선언
        Scanner sc = new Scanner(System.in);  // 입력 받을 스캐너 선언

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0. 종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int sel = sc.nextInt();
            if (sel == 1) {  // 1 입력 받을 시 멤버 서비스의 세이브 함수 호출
                memberService.save();
            } else if (sel == 2) {
                memberService.logIn();
            } else if (sel == 3) {
                memberService.all();
            } else if (sel == 4) {
                memberService.memberModify();
            } else if (sel == 5) {
                memberService.memberWithdraw();
            } else if (sel== 6) {
                memberService.logOut();
            } else if (sel == 7) {
                memberService.menu();
            } else if (sel==0) {
                break;
            }
        }
    }
}
