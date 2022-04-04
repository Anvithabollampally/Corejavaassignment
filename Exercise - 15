class LessBalanceException extends Exception {

  private double balance;

  public LessBalanceException(double amount) {
    this.balance = amount;
  }

  public double getBalance() {
    return balance;
  }

}

class Account {

  private int accNum;
  private double amount=0;

  public Account(int accNum) {
    this.accNum = accNum;
  }

  public void deposit(double deposit) {
    amount = amount + deposit;
  }

  public void withdraw(double withdraw) throws LessBalanceException {

    if(withdraw<amount) {
      amount = amount - withdraw;
    }else {
      throw new LessBalanceException(amount);
    }

  }

}

class Main {
  public static void main(String[] args) {
    Account a = new Account(100);
    System.out.println("Depositing the money is");
    a.deposit(1000);

  try{
    System.out.println("Withdrawing the money is");
    a.withdraw(100);
    a.withdraw(9000);
  }catch(LessBalanceException e) {

    System.out.println("Lessbalance: Remaining account balance is : "+e.getBalance());

  }


  }
}
