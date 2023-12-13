package ch10_class.ex10;

import java.util.Scanner;

public class Member {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
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

    public void setMemberName(String membeName) {
        this.memberName = membeName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public Member() {

    }

    public Member(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    public boolean memberLogin(String memberEmail, String memberPassword) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Sign In!");
        System.out.println("--------------------------");
        System.out.print("이메일 입력 > ");
        memberEmail = sc.next();
        System.out.print("비밀번호 입력 > ");
        memberPassword = sc.next();

        String test = this.toString();
        System.out.println(test);
        return memberEmail.equals(this.memberEmail) && memberPassword.equals(this.memberPassword);
    }

    @Override
    public String toString() {
        return "입력 값 : " +
                "memberEmail = '" + memberEmail + '\'' + " memberPassword = '" + memberPassword + '\'';
    }

}
