package p.ch_Package.Bank;
import java.util.Scanner;
public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner sc = new Scanner(System.in);
    public void createAccount() {
        boolean checkResult = false;
//        String accountNumber = null;
        do{
            System.out.println("희망하는 계좌번호를 입력하세요");
            String accountNumber = sc.next();
           checkResult = bankRepository.check(accountNumber);
            if (checkResult){
                System.out.println("사용 가능한 계좌번호입니다.");
                System.out.println("고객님의 성함을 작성해주세요");
                String clientName = sc.next();
                System.out.println("계좌 비밀번호를 입력하세요");
                String clientPass = sc.next();
                ClientDTO clientDTO = new ClientDTO(clientName,accountNumber,clientPass);
                boolean result = bankRepository.createAccount(clientDTO);
                if (result){
                    System.out.println("계좌등록 완료");
                }else {
                    System.out.println("계좌등록 실패");
                }
            }else {
                System.out.println("이미 사용 중인 계좌번호입니다. ");
            }
        }while (!checkResult);  // false 까지 do 반복
        }

    public void getBalance() {
        System.out.println("계좌번호를 입력해주세요");
        String accountNumber = sc.next();
        boolean result = bankRepository.checkAccount(accountNumber); //중복 확인
        if (result){
            long balance = bankRepository.getBalance(accountNumber);
            System.out.println("고객님의 잔액은"+balance+"입니다");
        }else {
            System.out.println("없는 계좌입니다.");
        }
    }

    public void deposit() {
        System.out.println("입금하시려는 계좌의 계좌번호를 입력하세요");
        String accountNumber = sc.next();
        boolean result = bankRepository.checkAccount(accountNumber);
        if (result){
            System.out.println("입금하시려는 금액을 입력해주세요");
            long deposit = sc.nextLong();
            bankRepository.deposit(accountNumber, deposit);
            AccountDTO accountDTO = new AccountDTO(accountNumber, deposit,0);
            bankRepository.bankingList(accountDTO);
        }else{
            System.out.println("없는 계좌 입ㄴ다");
        }
    }

    public void withdraw() {
        System.out.println("출금하시려는 계좌의 계좌번호를 입력하세요");
        String accountNumber = sc.next();
        boolean result = bankRepository.checkAccount(accountNumber);
        if (result){
            System.out.println("계좌의 비밀번호를 입력하세요");
            String clientPass = sc.next();
            boolean resultPass = bankRepository.checkPass(accountNumber, clientPass);
            if (resultPass){
                System.out.println("출금하시려는 금액을 입력해주세요");
                long withdraw = sc.nextLong();
                boolean resultWithdraw = bankRepository.withdraw(accountNumber, withdraw);
                if (resultWithdraw){
                    AccountDTO accountDTO = new AccountDTO(accountNumber, 0,withdraw);
                    bankRepository.bankingList(accountDTO);
                    System.out.println("출금 완료");
                }else {
                    System.out.println("잔액이 부족합니다.");
                }
            }else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }else {
            System.out.println("없는 계좌 입니다");
        }
    }

    public void transaction() {
        System.out.println("내역을 조회 할 계좌의 계좌번호를 입력하세요");
        String accountNumber = sc.next();
        boolean result = bankRepository.checkAccount(accountNumber);
        if (result){
            while (true){
                System.out.println("1.전체 내역 | 2.입금 내역  | 3. 출금 내역 | 4.종료" );
                int sel = sc.nextInt();
                if (sel==1){
                    bankRepository.bankingListAll(accountNumber);
                }if (sel==2){
                    bankRepository.bankingListDeposit(accountNumber);
                }if (sel==3){
                    bankRepository.bankingListWithdraw(accountNumber);
                }if (sel==4){
                    break;
                }
            }
        }else {
            System.out.println("없는 계좌번호 입니다.");
        }
    }

    public void transfer() {
        System.out.println("이체 받으실 계좌번호를 입력하세요");
        String recipientAccount = sc.next();
        boolean resultRecipient = bankRepository.checkAccount(recipientAccount);

        System.out.println("이체 할 계좌번호를 입력하세요 ");
        String senderAccount = sc.next();
        boolean resultSender = bankRepository.checkAccount(senderAccount);
        if (resultRecipient && resultSender ){
            System.out.println("이체 하실 금액을 입력해주세요");
            long  pay = sc.nextLong();
            boolean sender = bankRepository.withdraw(senderAccount,pay);
            bankRepository.deposit(recipientAccount, pay);
            if (sender){
                System.out.println("이체 완료.");
                AccountDTO accountDTO = new AccountDTO(senderAccount, 0,pay);
                bankRepository.bankingList(accountDTO);
                AccountDTO accountDTO1 = new AccountDTO(recipientAccount,pay,0);
                bankRepository.bankingList(accountDTO1);
            }else {
                System.out.println("계좌의 잔액이 부족합니다.");
            }
        }else {
            System.out.println("없는 계좌입니다.");
        }
    }
}
