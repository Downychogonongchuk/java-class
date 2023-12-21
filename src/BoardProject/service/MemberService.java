package BoardProject.service;

import BoardProject.dto.MemberDTO;
import BoardProject.repository.BoardRepository;
import BoardProject.repository.CommentRepository;
import BoardProject.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    CommentRepository commentRepository = new CommentRepository();
    BoardRepository boardRepository = new BoardRepository();
    Scanner sc = new Scanner(System.in);

    public void save() {
        boolean result = false;
        do {
            System.out.println("이메일을 입력하세요");
            String email = sc.next();
            result = memberRepository.emailCheck(email);
            if (result) {
                System.out.println("이미 있는 이메일 입니다.");
            } else {
                System.out.println("사용가능한 이메일 입니다");
                System.out.println("비밀번호: ");
                String pass = sc.next();
                System.out.println("이름: ");
                String name = sc.next();
                System.out.println("전화번호 : ");
                String mobile = sc.next();
                MemberDTO memberDTO = new MemberDTO(email,pass,name,pass);
                  memberRepository.save(memberDTO);
                System.out.println("회원 가입 완료");
            }
        } while (!result);
    }

    public void logIn() {
        System.out.println("이메일을 입력해주세요");
        String email = sc.next();
        System.out.println("비밀번호를 입력해주세요");
        String pass = sc.next();
        boolean result=  memberRepository.logIn(email,pass);
        if (result){
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }
    }
    public  void all(){
        List<MemberDTO>memberDTOList =  memberRepository.all();
    }
    public void memberList() {

    }

    public void memberModify() {
    }

    public void memberWithdraw() {
    }

    public void logOut() {
    }
}
