package selfStudy;

public class AccountExercise {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if(amount >0) {
            balance = balance + amount;
        }
    }

    public void transfer(int transfer) {
        if (transfer > 0) {
            balance = balance + transfer;
        }
    }

    public int getBalance() {
        return balance;
    }



}
