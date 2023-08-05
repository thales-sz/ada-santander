import java.util.ArrayList;

import utils.NotEnoughFoundsException;

class Bank {
  ArrayList<Account> accounts = new ArrayList<>();

  public void createNewAccount(Client client, int accountNumber) {
    Account newAccount = new Account(client, accountNumber);
    this.accounts.add(newAccount);
  }

  public void findAccount(int accountNumber) {
    for (Account account : this.accounts) {
      System.out.println(account.accountNumber);
      if (account.accountNumber == accountNumber) {
        System.out.println(account.toString());
        break;
      }
      System.out.println("Não foi possível encontrar a conta " + accountNumber);
    }
  }

  public void deposit(int accountNumber, double value) {
    for (Account account : this.accounts) {
      System.out.println(this.accounts);
      if (account.accountNumber == accountNumber) {
        account.deposit(value);
      } 
    }
  }

  public void withdraw(int accountNumber, double value) throws NotEnoughFoundsException {
    for (Account account : this.accounts) {
      if (account.accountNumber == accountNumber) {
        try {
          account.withdraw(value);
        } catch (NotEnoughFoundsException e) {
          throw new NotEnoughFoundsException("Saldo insuficiente");
        }
      }
    }
  }

  public void listAccounts() {
    System.out.println(this.accounts.toString());
  }
}

