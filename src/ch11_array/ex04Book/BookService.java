package ch11_array.ex04Book;

import ch11_array.ex03.Book;

import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner sc = new Scanner(System.in);
    BookRepository BookR = new BookRepository();

    public void save(){
        System.out.println("제목");
        String bookTitle = sc.next();
        System.out.println("작가");
        String bookAuthor = sc.next();
        System.out.println("가격");
        int bookPrice = sc.nextInt();
        System.out.println("출판사");
        String bookPublisher = sc.next();
        // BookDTO 객체 생성 +
        BookDTO BookD = new BookDTO(bookTitle,bookAuthor,bookPrice,bookPublisher);
        boolean result =BookR.save(BookD);
        // boolean 타입 result 로 받음 = 레포지토리.save메서드 에 BookD를 넘기면서 호출
        if ( result == true){
            System.out.println("등록성공");
        }else{
            System.out.println("등록실패");
        }


//        BookDTO BookD = new BookDTO(sc.next();, sc.next();,sc.nextInt());


    }
    public void findAll(){
    List<BookDTO> bookDTOList = BookR.findAll();
    for (BookDTO bookDTO: bookDTOList){
        System.out.println();
    }
//        BookR.findAll();
//        System.out.println(BookR.findAll());
    }
    public void findById(){
        System.out.println("Id입력");
        Long id = sc.nextLong();
        BookDTO BookD = BookR.findById(id);
        if (BookD!= null) {
            // 조회결과 있음
            System.out.println(BookD);
        } else {
            //조회결과 없음
            System.out.println("요청정보 없음");
        }
    }

    public void findByTitle(){
            String bookTitle = sc.next();
            BookDTO BookD = BookR.findByTitle(bookTitle);
            if (BookD!=null){
                System.out.println(BookD);
            }else {
                System.out.println("없음");
            }
    }
    public  void modify(){
        Long findId = sc.nextLong();
        BookDTO BookD = BookR.findById(findId);
    }
}
