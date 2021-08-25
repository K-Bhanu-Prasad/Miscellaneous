package bankaccountapp;

/**
 * @author bkuraman
 *
 */
public abstract class Account implements IBaseRate {

  String name;

  String sSN;

  double balance;

  String accNumber;

  double rate;

  static int index = 10000;

  public Account(String name, String sSN, double initialBalance) {
    this.name = name;
    this.sSN = sSN;
    this.balance = initialBalance;
    index++;
    this.accNumber = setAccountNumber();

    setRate();
  }

  public abstract void setRate();

  private String setAccountNumber() {

    String lastTwoSSN = this.sSN.substring(this.sSN.length() - 2, this.sSN.length());
    int uniqueId = index;
    int randomNumber = (int) (Math.random() * Math.pow(10, 3));
    return lastTwoSSN + uniqueId + randomNumber;

  }

  public void deposit(double amount) {

    this.balance = this.balance + amount;
    System.out.println("Depositing " + amount);
    printBalance();
  }

  public void withdraw(double amount) {

    this.balance -= amount;
    System.out.println("Withdrawing " + amount);
    printBalance();
  }

  public void transfer(String toWhere, double amount) {

    this.balance -= amount;
    System.out.println("Transferring " + amount + "to" + toWhere);
    printBalance();
  }

  public void printBalance() {

    System.out.println("Your balance is " + this.balance);
  }

  public void showInfo() {

    System.out.println("NAME: " + this.name);
    System.out.println("ACCOUNT NUMBER: " + this.accNumber);
    System.out.println("BALANCE:" + this.balance);
  }
}
