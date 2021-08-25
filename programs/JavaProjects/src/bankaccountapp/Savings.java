package bankaccountapp;

/**
 * @author bkuraman
 *
 */
public class Savings extends Account {

  int safetyDepositeBoxID;

  int safetyDepositeBoxKey;

  public Savings(String name, String sSN, double initialBalance) {
    super(name, sSN, initialBalance);
    this.accNumber = "2" + this.accNumber;
    setSafetyDepositBox();

  }

  private void setSafetyDepositBox() {

    this.safetyDepositeBoxID = (int) (Math.random() * Math.pow(10, 3));
    this.safetyDepositeBoxKey = (int) (Math.random() * Math.pow(10, 4));
  }

  @Override
  public void setRate() {

    this.rate = getRate() - .25;

  }

  @Override
  public void showInfo() {

    System.out.println("NEW SAVING ACCOUNT");
    super.showInfo();
    System.out.println("Your saving account features" + "\n Safety Deposit Box Id:" + this.safetyDepositeBoxID
        + "\n Safety Deposit Box Key: " + this.safetyDepositeBoxKey + "\nInterest Rate:" + this.rate + "%");
  }

}
