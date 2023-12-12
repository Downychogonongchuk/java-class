package ch10_class.ex05;

public class Book {
    /*
        제목(bookTitle)
        저자(bookAuthor)
        출판사(bookPublisher)
        isbn(isbn)
        가격(bookPrice)
     */
    // 기본 생성자
    //제목, 저자를 매개변수로 하는 생성자(매개변수 값을 필드에 담아야함)
    // 모든 필드값을 매개변수로 하는 생성자(매개변수 값을 ㅍ리드에 담아야함)

    String bookTitle;
    String bookAuthor;
    String bookPublisher;
    int  isbn;
    int bookPrice;
    public Book( ){
        System.out.println();
    }
    public Book(String bookTitle, String bookAuthor ){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        System.out.println("bookTitle = " + bookTitle + ", bookAuthor = " + bookAuthor);

    }
    public Book(String bookTitle, String bookAuthor, String bookPublisher, int isbn, int bookPrice){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookPublisher=bookPublisher;
        this.isbn=isbn;
        this.bookPrice=bookPrice;
        System.out.println("bookTitle = " + bookTitle + ", bookAuthor = " + bookAuthor + ", bookPublisher = " + bookPublisher + ", isbn = " + isbn + ", bookPrice = " + bookPrice);
    }


}
