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

    public void setId(long id) {
        this.id = id;
    }

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
        public void findById(long id){
            if (this.id==id){
                boardHits ++;
                System.out.println(boardContent);
            }

        }


}
