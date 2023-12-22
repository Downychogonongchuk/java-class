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
    MemberRepository memberRepository = new MemberRepository();  // 호출 할 멤버 레포지토리 선언
    BoardService boardService = new BoardService();  // 호출 할 보드 서비스 선언
    Scanner sc = new Scanner(System.in); // 입력 받을 스캐너 선언
 
    public void save() { // 회원가입 저장 함수
        boolean result = false;   // boolean 타입 변수 선언
        do {   // 이미 있는 이메일이면 입력 다시 받기 do while문 사용
            System.out.println("이메일을 입력하세요");
            String email = sc.next();
            result = memberRepository.emailCheck(email); 
            // 받은 이메일을 멤버 레포지토리의 이메일 체크 함수에 가져가서  결과를 boolean 타입의 변수 result에 담기
            if (result) { // if문은 true 일 경우 돌아감 //
                System.out.println("이미 있는 이메일 입니다.");
            } else { // false = 없는 이메일이라면
                System.out.println("사용가능한 이메일 입니다");
                System.out.println("비밀번호: ");
                String pass = sc.next();
                System.out.println("이름: ");
                String name = sc.next();
                System.out.println("전화번호 : ");
                String mobile = sc.next();
                MemberDTO memberDTO = new MemberDTO(email,pass,name,mobile);
                // 받을 변수 email이 do while안에 있어 dto 선언과 매개변수도 do while 안에서 선언
                // 멤버 디티오 타입의 변수 memberDTO 선언 생성자에 스캐너로 입력받은 값 매개변수로 넘겨 dto에 저장하기
                  memberRepository.save(memberDTO);
                  //memberRepository 의 save 함수에 위에서 선언하고 매개변수에 담은 값들 보내고 호출하기
                System.out.println("회원 가입 완료");
            }
        } while (result); // do while문 false면 끝남 // false여도 1번은 실행
    }

    public void logIn() {  // 로그인하는 메서드
        System.out.println("이메일을 입력해주세요");
        String email = sc.next();
        System.out.println("비밀번호를 입력해주세요");
        String pass = sc.next();
        boolean result=  memberRepository.logIn(email,pass);
        // 입력받은 email과 pass 를 memberRepository의 logIn 함수에 보내면서 호출
        // boolean 타입의 result 결과값으로 리턴 받고 결과를 대입
        if (result){
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }
    }
    public  void all(){  // 모든 멤버 리스트를 불러옴
        List<MemberDTO> memberDTOList =  memberRepository.all();
        // 리스트 타입의 리스트 변수 = 멤버 레포지토리의 all 함수를 호출 후 결과를 리스트에 담음
       memberList(memberDTOList); // 결과 값이 담긴 리스트를 담아서 memberList 메소드에 보내준다
    }
    public void memberList(List<MemberDTO> memberDTOList) {  // 멤버 리스트의 필요한 모든부분을 출력함
        // 받는 매개변수는 List<MemberDTO> 타입의 변수이름 memberDTOList
        for (MemberDTO memberDTO:memberDTOList) {
            System.out.println(memberDTO.getId()+memberDTO.getMemberEmail()+memberDTO.getMemberName()+memberDTO.getCreatedAt()+memberDTO.getMemberMobile());
        } // for each 문 List 사이즈 만큼 memberDTO를 실행 
        //get 가져오기
    }
    public void memberModify() { // 수정하는 메서드
        if (Common.loginEmail  != null){ // 공통으로 변하지않는 로그인 여부 확인 선언(public static loginEmail = null; )
            // 로그인이 되어있다면 
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
        if (Common.loginEmail != null){  // 로그인 되어있다면 
            Common.loginEmail = null; // 로그아웃
            System.out.println(" 로그아웃 성공");
        }else {
            System.out.println("로그인 되어있지 않습니다.");
        }
    }

    public void menu() {  // 게시판 속 회원제 게시판 (로그인 시에만 접속 가능)
        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 7.sample | 0.메인메뉴");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int sel = sc.nextInt();
            if (sel == 1) {
                    boardService.write();  // 보드 서비스 호출
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

