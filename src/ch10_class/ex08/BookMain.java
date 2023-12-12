package ch10_class.ex08;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookTitle("책 제목");

        String title = book.getBookTitle();
        System.out.println("title =" + title );
        // or
        System.out.println(book.getBookTitle());

        book.setBookAuthor("시인 김승");
        String Author =  book.getBookAuthor();
        // or
        System.out.println(book.getBookAuthor());
    }
}
