package ch10_class.ex11;


    public class Board {
              /*
     게시글 클래스
     필드
     글번호(id) - Long 타입
     제목(boardTitle)
     작성자(boardWriter)
     내용(boardContents)
     조회수(boardHits)
    */
    private long id;
    private  String boardTittle;
    private String BoardWriter;
    private  String boardContent;
    private int boardHits;
    /*
   필드에 대한 getter/setter
         */
    public long getId() {
        return id;
    }
    // getter / setter 작성법  alt + insert
    //  Getter
    // public + (필드에 선언한) 타입 + get 변수() {return + 변수 ; }
        // 타입 + get 변수 + return;
    public void setId(long id) {
        this.id = id;
    }
    // Setter
    // public + 리턴타입 +  set 변수(타입 +변수) { this. 변수 = 변수 ; }
        // 리턴 타입 + set변수 ( 타입+ 변수 ) + this
    public String getBoardTittle() {
        return boardTittle;
    }

    public void setBoardTittle(String boardTittle) {
        this.boardTittle = boardTittle;
    }

    public String getBoardWriter() {
        return BoardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        BoardWriter = boardWriter;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }
    /*
         생성자 2가지
         toString method
    */
    public  Board(){
    }
    public Board(long id, String boardTittle, String boardWriter, String boardContent, int boardHits){
        this.id =id;
        this.boardTittle=boardTittle;
        this.BoardWriter=boardWriter;
        this.boardContent=boardContent;
        this.boardHits=boardHits;
    }
        // 매개변수를 받아서 필드에 저장해 줄 생성자 생성
        // public + 클래스명 (  타입 + 변수  ){ this. 변수 = 변수; }
        //  접근 권한자 + 클래스명 (  매개변수  ){ 매개변수를 필드에 저장 }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", boardTittle='" + boardTittle + '\'' +
                ", BoardWriter='" + BoardWriter + '\'' +
                ", boardContent='" + boardContent + '\'' +
                ", boardHits='" + boardHits + '\'' +
                '}';
    }
    /*
     글조회 method
     name: findById
     parameter: id
     return: x
     실행내용
     main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
     print로 출력해준다.
     단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
     */
        public void findById(long id){  // 매개변수로 id 값을 받아오는 비교문 메서드
            if (this.id==id){
                boardHits ++;
                System.out.println(boardContent);
            }

        }


}
