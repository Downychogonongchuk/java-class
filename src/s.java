import java.util.Scanner;

public class s{
    public static void main(String[] args) {
     // # 1번 방법
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String ans =sc.next();
        switch(ans) {
            case "desk":
                System.out.println("책상입니다.");
            break;
            case "chair":
                System.out.println("의자입니다.");
            break;
            case "monitor":
                System.out.println("모니터입니다.");
            break;
            case "mouse":
                System.out.println("마우스입니다.");
            break;
            default:
                System.out.println("없는 단어입니다.");
        }
        System.out.println(ans);

// # 2번 방법
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String ans =sc.next();
        switch(ans) {
            case "desk": ans ="책상";
                break;
            case "chair": ans="의자";
                break;
            case "monitor": ans="모니터";
                break;
            case "mouse": ans="마우스";
                break;
        }
        System.out.println(ans);

// # 3번 방법
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String ans =sc.next();
        ans = switch (ans) {
            case "desk" -> "책상";
            case "chair" -> "의자";
            case "monitor" -> "모니터";
            case "mouse" -> "마우스";
            default -> ans;
        };
        System.out.println(ans);






        }
    }
