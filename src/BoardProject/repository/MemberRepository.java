package BoardProject.repository;

import BoardProject.common.Common;
import BoardProject.dto.BoardDTO;
import BoardProject.dto.CommentDTO;
import BoardProject.dto.MemberDTO;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO>memberDTOList = new ArrayList<>();

    public boolean emailCheck(String email) { // Email 중복 체크
        boolean result = false; // 없는 아이디
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email .equals(memberDTOList.get(i).getMemberEmail())){ 
                result = true; // 있는 아이디
            }
        }return result;
    }

    public void save(MemberDTO memberDTO) { // 받아온 DTO타입의 변수를 리스트에 저장
        memberDTOList.add(memberDTO); // .add는 boolean 타입
    }

    public boolean logIn(String email, String pass) { // 로그인 성공
        boolean result = false; 
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail()) && pass.equals(memberDTOList.get(i).getMemberPassword())){
                // 받은 이메일과 저장되어있는get(i)의 이메일이 같고 && 받은 비밀번호와 저장된 get(i).getPass가 같다면
                Common.loginEmail = email; // 로그인여부에 email 값을 담음
                result =true; // 조건 만족시 true
            }
        }return result;
    }
    public List<MemberDTO> all() {
        return memberDTOList;  // 모든 리스트 리턴
    }

    public void memberModify(String memberMobile) {
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if (Common.loginEmail.equals(memberDTOList.get(i).getMemberEmail())){
                // 로그인여부에 담긴 이메일과 멤버리스트의 저장된 이메일이 같다면 
                    memberDTOList.get(i).setMemberMobile(memberMobile);
                    // 해당 리스트 부분의 전화번호를 set 변경 > 받은 전화번호 값으로
            }
        }
    }

    public void memberWithdraw(String memberPassword) {
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if (Common.loginEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberDTOList.get(i).getMemberPassword().equals(memberPassword)) {
                // 로그인 여부에 담긴 이메일과 입력받은 이메일이 같고 && 멤버 리스트의 비밀번호와 입력받은 비밀번호가 같다면
                memberDTOList.remove(i); // 입력받은 해당 부분의 리스트를 삭제 (i)
            }
                }
            }
}


