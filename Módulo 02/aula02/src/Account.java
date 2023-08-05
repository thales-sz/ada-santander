import utils.NotEnoughFoundsException;

public class Account {
  Client client;
  double balance = 0.00;
  int accountNumber;

  Account(Client client, int accountNumber) {
    this.accountNumber = accountNumber;
    this.client = client;
  }

  public void deposit(double value) {
    this.balance += value;
  }

  public boolean withdraw(double value) throws NotEnoughFoundsException {
    if (this.balance < value) {
      throw new NotEnoughFoundsException("Saldo insuficiente");
    } else {
      this.balance -= value;
      return true;
    }
  }

  public boolean equals(Account account) {
    return this.accountNumber == account.accountNumber;
  }

  public String toString() {
    return "Account {" +
      "client=" + this.client.toString() +
      ", balance=" + this.balance +
      ", accountNumber=" + this.accountNumber +
      '}';
  }
}
