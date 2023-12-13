package ch10_class.ex0010;

public class Membera {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

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
    public Membera(){

    }
    public Membera(String memberEmail, String memberPassword, String memberName, String memberMobile){
        this.memberEmail = memberEmail;
        this.memberPassword=memberPassword;
        this.memberName = memberName;
        this.memberMobile= memberMobile;
    }

    public boolean memberLogin(String memberEmail, String memberPassword) {
        if (memberEmail.equals(this.memberEmail) && memberPassword.equals(this.memberPassword)) {
            return true;    // or  result = true;
        }else {
            return false;   // or result = false;
        }
        // return result;
    }
    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}
