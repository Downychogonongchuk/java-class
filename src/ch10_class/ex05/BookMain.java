package ch10_class.ex05;

public class BookMain {
    public static void main(String[] args) {
        // 책 정보는 시중에 있는 실제 책으로 해봅시다.
        // 기본생성자로 객체 만들고 필드값 채우기
        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book = new Book();
        Book book2 = new Book("차라투스투라는 이렇게 말했다","프리드리히 니체");
       book2.bookPublisher="김민수컴퍼니";
       book2.isbn=112233;
       book2.bookPrice=25000;
        Book book3 = new Book("안민우는 이렇게 말했다", "석재곤","Book은 김민수",1177,25000);


    }
}
