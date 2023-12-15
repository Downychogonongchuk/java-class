package ch11_array.ex04Book;

import ch11_array.T.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<BookDTO> dtoList = new ArrayList<>();
    // BookDTO 가 담긴 ArrayList 선언

    public boolean save(BookDTO BookD) {
//        dtoList.add(BookD);
        return dtoList.add(BookD);
    }

    public List<BookDTO> findAll() {
        return dtoList;

    }

    public BookDTO findById(Long id) {
        BookDTO BookD = null; //결과를 담을 dto 변수 선언
        for (int i = 0; i < dtoList.size(); i++) {
            if (id.equals(dtoList.get(i).getId())) {
                BookD = dtoList.get(i);  //dto에 결과를 담아서 출력
            }
        }
        return BookD;
    }

    public BookDTO findByTitle(String bookTitle) {
        BookDTO BookD = null;
        for (int i = 0; i < dtoList.size(); i++) {
            if (bookTitle.equals(dtoList.get(i).getBookTitle())) {
                BookD = dtoList.get(i);
            }
        }
        return BookD;


    }
public  List<BookDTO>search(String bookTitle){
        List<BookDTO>bookDTOS = new ArrayList<>();
        //검색결과가 ㅇ ㅕ럿 나와야 하니 담을 List 미리 만들기
        for (int i=0; i<dtoList.size(); i++){
            // 저장되어 있는 도서명에 검색어가 포함되어 씨으면 true
            if (dtoList.get(i).getBookTitle().contains(bookTitle)){
                // 조건을 만족하면 bookDTOS 에 추가
//                bookDTOS.add(dtoList.get(i));
                BookDTO bookDTO = dtoList.get(i);
                bookDTOS.add(bookDTO);
            }
        }
        return bookDTOS;
}

    public boolean update(Long id, int bookPrice) {
        boolean result = false;
        for (int i = 0; i < dtoList.size() ; i++) {
            if (id.equals(dtoList.get(i).getId())){
                dtoList.get(i).setBookPrice(bookPrice);
                // 아이디는 가져오고 가격은 수정 set
                result = true;
            }
        }
        return result;
    }
        public  boolean delete(Long id){
        boolean result = false;
            for (int  i = 0;  i< dtoList.size(); i++) {
                if (id.equals(dtoList.get(i).getId(id))){

                }
            }
        }



}