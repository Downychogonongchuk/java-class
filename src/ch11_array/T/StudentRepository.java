package ch11_array.T;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // 모든 학생 정보를 관리하는 저장소 역할의 리스트
    // 저장 , 수정, 삭제 등의 처리는 Repository에서만 이루어지도록 하기 위해 Private
    // 값을 계속 유지하기 위해 static

    private static List<StudentDto>studentDtoList = new ArrayList<>();
    public void method1(){
        System.out.println("StudentRepository.method1");
    }
    public void method2(String str1){
        System.out.println(str1);
    }
    // method name: method3
    // parameter : StudentDto
    // return : boolean
    //실행내용 : 전달받은 Dto 객체를 List에 저장하고 결과를 리턴
public  boolean method3(StudentDto stuD){
//        if (stuD.getId()==null){
//            System.out.println("어디감");
//        }
    studentDtoList.add(stuD);
        return studentDtoList.add(stuD) ;
}
//public  boolean method4(StudentDto stuD){
//// 전달 받은 stuD의 타입은 StudentDto 클래스 명
//// studentDtoList 에 stuD를 저장함
//    studentDtoList.add(stuD);
//        return studentDtoList.add(stuD);
//}
//return type : List
public  List<StudentDto> method4 (){
    // 리턴타입 List 는 선언한 그대로
     return studentDtoList;
    }
    // name : method5
    // parameter: Long
    // return : StudentDto
    public   StudentDto method5(Long id){
        // id 와 일치하는 데이터가 있으면 해당 DTO객체를 리턴하고
        // 없으면 null 을 리턴함
        StudentDto studentDto = null;
        for (int i = 0; i < studentDtoList.size(); i++) {
            if (id.equals(studentDtoList.get(i).getId())){
                studentDto = studentDtoList.get(i);
            }
        }
        return studentDto;
    }
//    public method6(){

    }
//}
