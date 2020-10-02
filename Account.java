import java.util.Scanner;

/**
 * Modified version of the Account class
 *
 * You can credit and debit the amount
 */
public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void credit(double depositAmount) {
        if (depositAmount < 0) {
            depositAmount = 0;
            System.out.println("Deposit amount can not be a negative integer");
        }
        this.balance += depositAmount;
    }

    public void debit(double amount) {
        if (amount < this.balance) {
            if (amount >= 0) {
                this.balance -= amount;
            } else {
                System.out.println("Negative amount");
            }
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

    public Double getBalance() {
        return balance;
    }

}
