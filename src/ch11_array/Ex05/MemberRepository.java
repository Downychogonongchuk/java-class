package ch11_array.Ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {
    Scanner sc = new Scanner(System.in);
    private static List<MemberDto>memberDtoList = new ArrayList<>();
    public boolean signUp(MemberDto memberDto) {
        return memberDtoList.add(memberDto);
    }

    public MemberDto logIn(String memberEmail, String memberPassword) {
        MemberDto memberDto = null;
        for (int i = 0; i < memberDtoList.size(); i++) {
            if (memberEmail.equals(memberDtoList.get(i).getMemberEmail()) && memberPassword.equals(memberDtoList.get(i).getMemberPassword())){
                    memberDto = memberDtoList.get(i);
            }
        }
        return memberDto;
    }

    public List<MemberDto> findAll() {
        return memberDtoList;
    }

    public void upDate() {
        System.out.println("변경할 비밀번호를 입력하세요");
        String memberPassword = sc.next();
        memberDtoList.get(1).setMemberPassword(memberPassword);
    }

    public void withDraw() {
        System.out.println("비밀번호를 입력하세요");
        String memberPassword = sc.next();
        boolean result = false;
        for (int i = 0; i < memberDtoList.size(); i++) {
            if (memberPassword.equals(memberDtoList.get(i).getMemberPassword())){
                    memberDtoList.remove(i);

            }
            }
        }

    public boolean check(String memberEmail) {
            List<MemberDto>memberDtos = new ArrayList<>();
            boolean result = true;
        for (int i = 0; i < memberDtoList.size(); i++) {
            if (memberDtoList.get(i).getMemberEmail().contains(memberEmail)) {
                result = false;

            }
        }
        return result;
    }
}



