package Control;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import Model.*;
import View.*;

public class Control {
    Bank bank = new Bank();
    int optionSelected = 0;
    int index;
    String name;
    double newBalance;
    double balance;
    public void showMenu(){
        do
        {
            if(bank.getAccounts().size()==0){
                optionSelected = InputOutput.getIndexMenuZero();
            }
            else {
                optionSelected = InputOutput.getIndexMenu();
            }

            switch (optionSelected)
            {
                case 0: // Create Model.Account option
                    Account account = new Account();
                    name = InputOutput.getNameAccount();

                    account.setNameAccount(name);
                    account.setType(InputOutput.getTypeAccount());
                    account.setBalance(InputOutput.getBalanceAccount());
                    do{
                        account.setCpf(InputOutput.getCPFAccount());
                        if(account.getCpf().length() != 11){
                            InputOutput.errorCPF();
                        }
                    }while (account.getCpf().length() != 11);

                    bank.setNames(name);
                    bank.setAccounts(account);
                    break;

                case 1: // Deposit option
                    if(bank.getAccounts().size()==0){
                        System.exit(0);
                    }
                    Movement depositMovement = new Movement();

                    index = InputOutput.selectAccount(bank.getNames());
                    newBalance = InputOutput.depositMoney();

                    bank.getAccounts().get(index).setBalance(newBalance);
                    depositMovement.setMoves("Deposit: R$" + newBalance + " - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));


                    bank.getAccounts().get(index).setDepositsMoves(depositMovement.getMoves());
                    bank.getAccounts().get(index).setTotalMoves(depositMovement.getMoves());
                    InputOutput.showBalance(bank.getAccounts().get(index).getBalance(), bank.getAccounts().get(index).getNameAccount());
                    break;

                case 2: // Withdraw option
                    Movement withdrawMovement = new Movement();
                    int count=0;
                    index = InputOutput.selectAccount(bank.getNames());
                    do {
                        newBalance = InputOutput.withdrawMoney();
                        balance = bank.getAccounts().get(index).getBalance();

                        if((balance+newBalance) > -1000){
                            bank.getAccounts().get(index).setBalance(newBalance);
                            count = 1;
                        }
                        else{
                            InputOutput.errorMessage((balance + newBalance), newBalance);
                        }
                    }while (count!=1);

                    withdrawMovement.setMoves("Withdraw: R$" + newBalance + " - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                    bank.getAccounts().get(index).setWithdrawMoves(withdrawMovement.getMoves());
                    bank.getAccounts().get(index).setTotalMoves(withdrawMovement.getMoves());
                    InputOutput.showBalance(bank.getAccounts().get(index).getBalance(), bank.getAccounts().get(index).getNameAccount());
                    break;

                case 3: // GetBalance option
                    index = InputOutput.selectAccount(bank.getNames());

                    InputOutput.showBalance(bank.getAccounts().get(index).getBalance(), bank.getAccounts().get(index).getNameAccount());
                    break;

                case 4: // GetDataAccount option
                    index = InputOutput.selectAccount(bank.getNames());
                    String name = bank.getAccounts().get(index).getNameAccount();
                    int type = bank.getAccounts().get(index).getType();
                    double balance = bank.getAccounts().get(index).getBalance();
                    String cpf = bank.getAccounts().get(index).getCpf();


                    InputOutput.showDataAccount(name, type, balance, cpf);
                    break;

                case 5: // GetExtract option
                    index = InputOutput.selectAccount(bank.getNames());
                    ArrayList<String> totalMovesArray = bank.getAccounts().get(index).getTotalMoves();

                    InputOutput.showMoves(totalMovesArray, bank.getAccounts().get(index).getNameAccount());
                    break;

                case 6: // GetExtractDeposit option
                    index = InputOutput.selectAccount(bank.getNames());
                    ArrayList totalDepositArray = bank.getAccounts().get(index).getDepositsMoves();

                    InputOutput.showMoves(totalDepositArray, bank.getAccounts().get(index).getNameAccount());
                    break;

                case 7: // GetExtractWithdraw option
                    index = InputOutput.selectAccount(bank.getNames());
                    ArrayList totalWithdrawArray = bank.getAccounts().get(index).getWithdrawMoves();

                    InputOutput.showMoves(totalWithdrawArray, bank.getAccounts().get(index).getNameAccount());
                    break;

                case 8: // Exit option
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
