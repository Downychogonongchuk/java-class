package ch11_array.Ex005.Ex05;

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
