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

