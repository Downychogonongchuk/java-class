package ch10_class.ex08;

public class Book {
    // private // 같은 클래스 내에서 만 사용가능 그 외 getter setter
    // 필드는 private 으로 감싸자 규칙
    private String bookTitle;
    private String bookAuthor;

    //bookTitle setter
    public void setBookTitle(String bookTitle){
        this. bookTitle = bookTitle;
        // setter 규칙 public + void + set 000 (타입 + 가져올 변수)
        // this. 가져올 필드 = 가져올 변수
    }
        // bookTitle getter
    public  String getBookTitle(){
        return bookTitle;
        // getter 규칙 public + 타입 + get000
        // return 가져올 변수;
    }
    public  void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }  // void + 매개변수 + this
    public String getBookAuthor(){
        return bookAuthor;
    } // 타입 + 리턴



}
