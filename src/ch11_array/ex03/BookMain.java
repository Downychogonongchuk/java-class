package ch11_array.ex03;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        // 기본 생성자에 하나씩 저장 객체명+ . set _ ( );

        book1.setBookTitle("달력");
        book1.setBookAuthor("모니터");
        book1.setBookPrice(70000);
        book1.setBookpublisher("김승경");

        Book book2 = new Book("콜라", "커피",1000,"작가");
        // List에 객체 추가하는 선언 List . add(); 메서드 사용
        Book book3 = new Book("크레용","뿌이뿌이뿌이",1000,"omg");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for (int i = 0; i< bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
        for (Book  bk : bookList) {
            System.out.println(bk);
        }
        bookList.get(0).setBookPrice(50000);
        bookList.get(1).setBookpublisher("안녕출판사");

        for (int i = 0; i< bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
        for (Book  bk : bookList) {
            System.out.println(bk);
        }



    }
}
