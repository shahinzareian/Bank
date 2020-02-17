public class Account {
    String accountHolderName;
    int balance;
    String bankName;
    String INBN;

    public Account(String accountHolderName, int balance, String bankName, String INBN) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bankName = bankName;
        this.INBN = INBN;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getINBN() {
        return INBN;
    }

    public void setINBN(String INBN) {
        this.INBN = INBN;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", bankName='" + bankName + '\'' +
                ", INBN='" + INBN + '\'' +
                '}';
    }

    public void add(int balance) {
        int total;
        total = this.balance + balance;
        System.out.println("your old money was: " + this.balance + "Euro and your added "+balance+" Euro to your account. now your new balance is: " + total+ " Euro" );
        this.balance = total;

    }
    public void remove(int balance) {
        int total;
        total = this.balance - balance;
        System.out.println("your old money was: " + this.balance + "Euro and your removed "+balance+" Euro from your account. now your new balance is: " + total+ " Euro" );
        this.balance = total;
    }
    public void transferTo(Account account, int transfer){
        int total;
        total=this.balance+transfer;
        account.balance+=transfer;
        System.out.println("your old money was: " + this.balance + "Euro and your transfered "+transfer+" Euro to another account . now your new balance is: " + total+ " Euro" );
        this.balance-=transfer;


    }

}
