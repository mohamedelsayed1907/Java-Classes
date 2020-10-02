public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account("Mohamed", 10000.0);
        account.credit(10000.0);
        account.debit(5000.0);

        System.out.printf("\nAccount Balance: %s", account.getBalance());


    }

    public static void printAccountInfo(Account account) {
        System.out.printf("\n[%s] $%.2f", account.getName(), account.getBalance());
    }
}
