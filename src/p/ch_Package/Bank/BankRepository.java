package p.ch_Package.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private static List<ClientDTO> clientDTOList = new ArrayList<>();
    private static List<AccountDTO> accountDTOList = new ArrayList<>();


    public boolean check(String accountNumber) { // 계좌 여부 확인
        boolean result = true;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                result = false;
            }
        }
        return result;
    }

    public boolean createAccount(ClientDTO clientDTO) { // 계좌 생성
        return clientDTOList.add(clientDTO);
    }

    public long getBalance(String accountNumber) { // 잔액조회
        long balance = 0;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                balance = clientDTOList.get(i).getBalance();
            }
        }
        return balance;
    }

    public boolean checkAccount(String accountNumber) { // 계좌 중복 확인
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                result = true;
            }
//             else {
//                result = false;
//            }
        }
        return result;
    }

    public void deposit(String accountNumber, long deposit) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                long balance = clientDTOList.get(i).getBalance();
                balance += deposit;
                clientDTOList.get(i).setBalance(balance);
//                  accountDTOList.get(i).setDeposit(accountDTOList.get(i).getDeposit()+=deposit);

            }
        }
    }

    public boolean withdraw(String accountNumber, long withdraw) {
        boolean result = true;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                long balance = clientDTOList.get(i).getBalance();
                if (balance < withdraw) {
                    result = false;
                } else {
                    balance -= withdraw;
                    clientDTOList.get(i).setBalance(balance);
                }
            }
        }
        return result;
    }

    public boolean checkPass(String accountNumber, String clientPass) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                String Pass = clientDTOList.get(i).getClientPass();
                if (Pass.equals(clientPass)) {
                    result = true;
                }
            }
        }
        return result;
    }

    public void bankingList(AccountDTO accountDTO) {
        accountDTOList.add(accountDTO);
    }

    public void bankingListAll(String accountNumber) {
        for (int i = 0; i <accountDTOList.size() ; i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())){
                System.out.println(accountDTOList.get(i));
            }
        }


    }

    public void bankingListDeposit(String accountNumber) {
        for (int i = 0; i < accountDTOList.size(); i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                if (accountDTOList.get(i).getDeposit() != 0) {
                    long deposit = accountDTOList.get(i).getDeposit();
                    String bankingAt = accountDTOList.get(i).getBankingAt();
                    System.out.println("입금시간 : " + bankingAt + "\t" + "입금액" + deposit);
                }
            }
        }
    }

    public void bankingListWithdraw(String accountNumber) {
        for (int i = 0; i < accountDTOList.size(); i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                if (accountDTOList.get(i).getWithdraw() != 0) {
                    long withdraw = accountDTOList.get(i).getWithdraw();
                    String bankingAt = accountDTOList.get(i).getBankingAt();
                    System.out.println("출금시간 : " + bankingAt + "\t" + "출금액" + withdraw);
                }
            }
        }
    }
}



