package p.ch_Package.Bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.신규 계좌 등록 | 2.잔액 조회 | 3.입금 | 4.출금 | 5.입출금 내역 조회 | 6.계좌 이체 | 0. 종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int sel = sc.nextInt();
            if (sel == 1) {
                bankService.createAccount();
            } else if (sel == 2) {
                bankService.getBalance();
            } else if (sel == 3) {
                bankService.deposit();
            } else if (sel == 4) {
                bankService.withdraw();
            } else if (sel == 5) {
                bankService.transaction();
            } else if (sel== 6) {
                bankService.transfer();
            } else if (sel == 0) {
                break;
            }
        }
    }
}