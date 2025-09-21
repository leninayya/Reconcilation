package com.example.reconciliation;

/**
 * A concrete class representing a transaction made via a bank check.
 * It extends the base Transaction class and implements its own validation
 * and processing logic.
 */
public class BankCheckTransaction extends Transaction {
    private String checkNumber;

    /**
     * Constructor for BankCheckTransaction.
     */
    public BankCheckTransaction(double amount, String transactionDate, String checkNumber) {
        super(amount, transactionDate);
        this.checkNumber = checkNumber;
    }

    @Override
    protected void validate() {
        System.out.println("VALIDATING: Verifying signature and funds for check number: " + this.checkNumber);
    }

    @Override
    protected void process() {
        System.out.println("PROCESSING: Clearing funds and processing payment against bank account for check " + this.checkNumber);
    }
}