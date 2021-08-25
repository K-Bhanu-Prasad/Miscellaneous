package bankaccountapp;

/**
 * @author bkuraman
 *
 */
public class Checking extends Account {

  int debitCardNumber;

  int debitCardPIN;

  public Checking(String name, String sSN, double initialBalance) {
    super(name, sSN, initialBalance);
    this.accNumber = "1" + this.accNumber;

    setDebitCard();

  }

  private void setDebitCard() {

    this.debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
    this.debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
  }

  @Override
  public void showInfo() {

    System.out.println("NEW CHECKING ACCOUNT");
    super.showInfo();
    System.out.println("Your Checking account features " + "\nDebit card number: " + this.debitCardNumber
        + "\nDebit card pin: " + this.debitCardPIN + "\nInterest Rate:" + this.rate + "%");

  }

  @Override
  public void setRate() {

    this.rate = getRate() * .15;
  }

}
