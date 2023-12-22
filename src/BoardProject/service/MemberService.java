package BoardProject.service;

import BoardProject.common.Common;
import BoardProject.dto.BoardDTO;
import BoardProject.dto.MemberDTO;
import BoardProject.repository.BoardRepository;
import BoardProject.repository.CommentRepository;
import BoardProject.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    BoardService boardService = new BoardService();
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
                MemberDTO memberDTO = new MemberDTO(email,pass,name,mobile);
                  memberRepository.save(memberDTO);
                System.out.println("회원 가입 완료");
            }
        } while (result);
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
        List<MemberDTO> memberDTOList =  memberRepository.all();
       memberList(memberDTOList);
    }
    public void memberList(List<MemberDTO> memberDTOList) {
        for (MemberDTO memberDTO:memberDTOList) {
            System.out.println(memberDTO.getId()+memberDTO.getMemberEmail()+memberDTO.getMemberName()+memberDTO.getCreatedAt()+memberDTO.getMemberMobile());
        }
    }
    public void memberModify() {
        if (Common.loginEmail  != null){
            System.out.println("변경하실 전화번호를 입력하세요");
            String memberMobile = sc.next();
            memberRepository.memberModify(memberMobile);
            System.out.println("전화번호가 변경되었습니다.");
        }else {
            System.out.println("로그인이 필요합니다.");
        }
    }
    public void memberWithdraw() {
        if (Common.loginEmail != null){
            System.out.println("비밀번호를 입력해주세요");
            String memberPassword = sc.next();
            memberRepository.memberWithdraw(memberPassword);
            System.out.println("회원 탈퇴 완료");
        }else {
            System.out.println("로그인이 필요합니다");
        }
    }

    public void logOut() {
        if (Common.loginEmail != null){
            Common.loginEmail = null;
            System.out.println(" 로그아웃 성공");
        }else {
            System.out.println("로그인 되어있지 않습니다.");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 7.sample | 0.메인메뉴");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int sel = sc.nextInt();
            if (sel == 1) {
                    boardService.write();
            } else if (sel == 2) {
                    boardService.boardList();
            } else if (sel == 3) {
                    boardService.findById();
            } else if (sel == 4) {
                    boardService.boardUpdate();
            } else if (sel == 5) {
                    boardService.boardDelete();
            } else if (sel== 6) {
                    boardService.boardSearch();
            } else if (sel == 7) {

            } else if (sel==0) {
                break;
            }
        }
    }
    }

