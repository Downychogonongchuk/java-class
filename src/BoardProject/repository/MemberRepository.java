package BoardProject.repository;

import BoardProject.common.Common;
import BoardProject.dto.BoardDTO;
import BoardProject.dto.CommentDTO;
import BoardProject.dto.MemberDTO;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO>memberDTOList = new ArrayList<>();
    List<BoardDTO>boardDTOList = new ArrayList<>();
    List<CommentDTO>commentDTOList = new ArrayList<>();
    public boolean emailCheck(String email) { // Email 중복 체크
        boolean result = false; // 없는 아이디
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email .equals(memberDTOList.get(i).getMemberEmail())){ 
                result = true; // 있는 아이디
            }
        }return result;
    }

    public void save(MemberDTO memberDTO) {
        memberDTOList.add(memberDTO);
    }

    public boolean logIn(String email, String pass) { // 로그인 성공
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail()) && pass.equals(memberDTOList.get(i).getMemberPassword())){
                Common.loginEmail = email;
                result =true;
            }
        }return result;
    }
    public List<MemberDTO> all() {
        return memberDTOList;
    }
    public  void memberList() {

    }
}
