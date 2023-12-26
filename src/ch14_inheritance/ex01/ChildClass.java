package ch14_inheritance.ex01;

public class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("자식 기본 생성자");
    }

    // 메서드 재정의
    @Override
        public  void hello(){ // 메서드 안의 실행 부분만 수정 가능
        System.out.println("ChildClass.hello");
    }

}
