package ch11_array.Ex05;

import java.util.List;
import java.util.Scanner;

public class MemberServeice {
    MemberRepository memberRepository = new MemberRepository();
    Scanner sc = new Scanner(System.in);
    private static String loginEmail = null;

    public void signUp() {
        while (true){
            System.out.println("이메일을 입력하세요");
            String memberEmail = sc.next();
            boolean result=  memberRepository.check(memberEmail);
            if (result){
                System.out.println("사용가능한 이메일입니다.");
                break;
            }else {
                System.out.println("이미 사용중인 이메일입니다.");
            }
        }
        System.out.println("비밀번호를 입력하세요");
        String memberPassword = sc.next();
        System.out.println("이름을 입력하세요");
        String memberName = sc.next();
        System.out.println("전화번호를 입력하세요");
        String memberMobile = sc.next();
        MemberDto memberDto = new MemberDto(memberEmail,memberPassword,memberName,memberMobile);
        boolean result1 = memberRepository.signUp(memberDto);
        if (result1){
            System.out.println("회원가입 성공");
        }else {
            System.out.println("회원 가입 실패");
        }
    }


    public void logIn() {
        System.out.println("이메일을 입력하세요");
        String memberEmail = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String  memberPassword = sc.next();
        MemberDto memberDto  = memberRepository.logIn(memberEmail,memberPassword);
        if (memberDto != null){
            System.out.println("로그인 성공");
            loginEmail = memberEmail;
        }else {
            System.out.println("로그인 실패");
        }
    }

    public void findAll() {
        List<MemberDto>memberDtoList = memberRepository.findAll();
        for (MemberDto memberDto: memberDtoList){
            System.out.println(memberDto);
        }
    }

    public void upDate() {
        if (loginEmail != null){ // 일치함
            memberRepository.upDate();
        } else if (loginEmail == null) {
            System.out.println("로그인이 필요합니다");
        }
    }

    public void withDraw() {
        if (loginEmail !=null){
                memberRepository.withDraw();
            System.out.println("회원 탈퇴되었습니다.");
        }else {
            System.out.println("로그인 하세요");
        }
    }

    public void logOut() {
        loginEmail = null;
    }
}

