package banksystem;

/**
 * A class for Account, which its object could be a saving account or a checking account
 * @author Hong Hien Pham
 */
public class Account {
    private char type;
    private double balance;

    /**
     * Default constructor: usually, when people go to a bank, their
     * first accounts would be the checking accounts with initial value of 0
     */
    public Account() {
        this.type = 'c';
        this.balance = 0;
    }
    
    /**
     * Constructor with 2 parameters
     * @param type: type of an account (checking or saving)
     * @param balance: the amount of money within that account
     */
    public Account(char type, double balance) {
        this.type = type;
        this.balance = balance;
    }
    
    /**
     * Copy constructor: copy the type and balance of an account to another
     * @param account: an account to be copied
     */
    public Account(Account account) {
        this.type = account.type;
        this.balance = account.balance;
    }
    
    /**
     * To compare if the two accounts are the same (in terms of type and balance)
     * @param account: an account to be compared to 
     * @return true if equal; else, false
     */
    public boolean equals(Account account) {
        return this.type == account.type && this.balance == account.balance;
    }

    /**
     * put the type and balance of an account to a String str and return it
     * @return str
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %s\n", "Type", type == 'c' ? "Checking" : "Saving");
        str += String.format("%-10s: $%.2f\n", "Balance", balance);
        
        return str;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
