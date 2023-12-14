package ch11_array.T;

import ch11_array.Ex02.Student;

public class StudentDto {
    private long id;
    private  String studentName;
    private  String studentNumber;
    private  String studentMajor;
    private  String studentMobile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public StudentDto(){

    }
    private static Long idValue = 1L;
    public StudentDto(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.id = idValue++;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }
}
