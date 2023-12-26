package Ex01_MapBasic.Ex05;

import java.util.*;

public class MemberRepository {
    Scanner sc = new Scanner(System.in);

    private static Map<Long , MemberDto> memberDtoMap = new HashMap<>();

    public boolean signUp(MemberDto memberDto) {
        MemberDto dto = memberDtoMap.put(memberDto.getId(), memberDto);
        //  MemberDto dto = memberDtoMap.put ( key ,  value);
        if (dto==null){
            return  true;
        }else {
            return false;
        }
    }

    public MemberDto logIn(String memberEmail, String memberPassword) {
            MemberDto result = null;
        for (Long i : memberDtoMap.keySet()){
            // .key set key 값 Long 을 객체생성
            if(memberEmail.equals(memberDtoMap.get(i).getMemberEmail()) && memberPassword.equals(memberDtoMap.get(i).getMemberPassword())){
                result =  memberDtoMap.get(i);
            }
        }return  result;
        }


    public Map<Long, MemberDto> findAll() {
        return memberDtoMap;
    }

    public boolean upDate( String loginEmail, String mobile) {
        for (Long i: memberDtoMap.keySet()) {
            if (loginEmail.equals(memberDtoMap.get(i).getMemberEmail())){
              memberDtoMap.get(i).setMemberMobile(mobile);
              return true;
            }
        }return false;
    }

    public void withDraw() {
        System.out.println("비밀번호를 입력하세요");
        String memberPassword = sc.next();
        boolean result = false;
        for (Long i: memberDtoMap.keySet()) {
            if (memberPassword.equals(memberDtoMap.get(i).getMemberPassword())){
                memberDtoMap.remove(i);
                result = true;
            }
        }
        }

    public boolean check(String memberEmail) {
            boolean result = true;
        for (Long i:memberDtoMap.keySet()) {
            if (memberEmail.equals(memberDtoMap.get(i).getMemberEmail()))
                result = false;
        }return result;
    }
}



