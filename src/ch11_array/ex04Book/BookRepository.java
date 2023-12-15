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

}

