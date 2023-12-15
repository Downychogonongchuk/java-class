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
        System.out.println(bookDTO);
    }
//        BookR.findAll();
//        System.out.println(BookR.findAll());
    }
    public void findById(){
        System.out.println("Id입력");
        Long id = sc.nextLong();
        
        BookDTO BookD = BookR.findById(id);
        // Repository의findById메서드에id를 담자/ BookDTO의 타입으로 BookD
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
    public void search(){
        System.out.println("검색어 : ");
        String bookTitle = sc.next();
        List<BookDTO> bookDtoList = BookR.search(bookTitle);
        if (bookDtoList.size() > 0){
            for (BookDTO bookDTO: bookDtoList){
                System.out.println("bookDTO = " + bookDTO);
            }
        }else {
            //bookDTOList.size()==0 => 결과가 없다.
            System.out.println("검색결과가 없습니다");
        }
    }

        public  void update(){
        // 수정할 id 를 입력받음
            // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
            // 없으면 없다고 출력
            System.out.println("Id입력");
            Long id = sc.nextLong();
            BookDTO BookD = BookR.findById(id);
            // Repository의findById메서드에id를 담자/ BookDTO의 타입으로 BookD
            if (BookD!= null) {
                System.out.println(BookD);
                int bookPrice = sc.nextInt();
                boolean updateResult =  BookR.update(id, bookPrice);
                // 수정 시 어떤 책의 가격을 변경 할지 모르니 수정할 책 id 와 가격 같이 보냄
                if (updateResult){
                    System.out.println("수정성공");
                }else {
                    System.out.println("수정실패");
                }
            } else {
                System.out.println("조회결과 없음");
            }

        }

//    public  void modify(){
//        Long findId = sc.nextLong();
//        BookDTO BookD = BookR.findById(findId);
//    }
        public void delete(){
            System.out.println("삭제할 id : ");
            Long id = sc.nextLong();
            boolean result = BookR.delete(id);
            if (result){
                System.out.println("삭제성공");
            }else {

            }
        }



}
