package Ex01_MapBasic.Ex05;

/** 설하언니가 연말이니까 다같이 술마시자고 밥방 멤 모아본다고 했는데 ㄱㄴ?
 * 12월 금요일 언젠가 ㄱㄴ?
 *
 *
 */


public class MemberDto {
    private  long id;
    private String memberEmail;
    private String memberPassword;
    private  String memberName;
    private String  memberMobile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    private static long idValue = 1L;

    public MemberDto(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.id = idValue++;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "memberDto{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}
