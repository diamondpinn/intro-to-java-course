package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    // Instance variable for overdraft limit
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Getter for overdraft limit
    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    // Setter for overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the withdraw method to allow overdraft
    @Override
    public double withdraw(double requested) {
        if (requested > 0 && this.getBalance() + this.overdraftLimit >= requested) {
            double newBalance = this.getBalance() - requested;
            this.setBalance(newBalance); // Directly set the balance
            return requested;
        } else {
            return 0;
        }
    }

    // Protected method to set the balance, used within the class and subclasses
    protected void setBalance(double balance) {
        super.balance = balance;
    }
    
}
