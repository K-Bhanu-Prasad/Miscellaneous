package bankaccountapp;

import java.io.IOException;
import java.util.List;

import bankaccountapp.utilities.CSV;

/**
 * @author bkuraman
 *
 */
public class BankAccountApp {

  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub

    Savings saving = new Savings("Bhanu", "23456789", 5000);
    // saving.showInfo();
    // saving.deposit(5000);
    // saving.withdraw(500);
    // saving.transfer("Mr.Wilson", 500);
    // System.out.println("***********************");
    // Checking checking = new Checking("Prasad", "45678945", 500);
    // checking.showInfo();

    List<String[]> readFile = CSV.read("C:\\Users\\bkuraman\\NewBankAccounts.csv");
    for (String[] accountHolder : readFile) {
      System.out
          .println(accountHolder[0] + "\n" + accountHolder[1] + "\n" + accountHolder[2] + "\n" + accountHolder[3]);

    }
  }

}
