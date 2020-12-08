package banksystem;

import java.util.ArrayList;

/**
 * 
 * @author Hong Hien Pham
 */
public class User {
    private String userId;//auto-generated
    private String userName;//User-defined
    private String password;//''
    private Account savingAccount;
    private Account checkingAccount;
    private ArrayList<Record> history;
    private static int nextId = 1;
    
    //Default Constructor 
    public User() { //unnescessary 
        this.userId = String.format("%06d", nextId++);
        this.userName = null;
        this.password = null;
        this.savingAccount = null;
        this.checkingAccount = null;
        this.history = null;
    }

    // Constructor with 2 parameters
    public User(String userName, String password) {
        this.userId = String.format("%06d", nextId++);
        this.userName = userName;
        this.password = password;
        this.savingAccount = null;
        this.checkingAccount = new Account();
        this.history = new ArrayList<>();
    }
    
    //Copy Constructor
    public User(User user) {
        this.userId = user.userId;
        this.userName = user.userName;
        this.password = user.password;
        this.savingAccount = new Account(savingAccount);
        this.checkingAccount = new Account(checkingAccount);
        this.history = new ArrayList<>(history);
    }

    //Compare to see if equal
    public boolean equals(User user) {
        return this.userId.equals(user.userId) &&
            this.userName.equals(user.userName) &&
            this.password.equals(user.userId) &&
            this.savingAccount.equals(user.savingAccount) &&
            this.checkingAccount.equals(user.checkingAccount) &&
            this.history.equals(user.history);
    }
    
    //String with all info
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-20s: %s\n", "User ID", userId);
        str += String.format("%-20s: %s\n", "User Name", userName);
        str += String.format("%-20s: %s\n", "Saving Account", savingAccount);
        str += String.format("%-20s: %s\n", "Checking Account", checkingAccount);
        str += String.format("%-20s: %s\n", "History", history);
        
        return str;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(Account savingAccount) {
        this.savingAccount = savingAccount;
    }

    public Account getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(Account checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public ArrayList<Record> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Record> history) {
        this.history = history;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }
}
