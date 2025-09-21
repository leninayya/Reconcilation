package com.example.reconciliation;

import java.util.UUID;

/**
 * An abstract base class for all financial transactions.
 * It implements the Reconcilable interface and provides a template for the
 * reconciliation process, defining common properties and methods.
 */
public abstract class Transaction implements Reconcilable {
    // Common properties for all transactions
    protected String transactionId;
    protected double amount;
    protected String transactionDate;

    /**
     * Constructor for the Transaction class.
     * @param amount The monetary value of the transaction.
     * @param transactionDate The date the transaction occurred.
     */
    public Transaction(double amount, String transactionDate) {
        // Generate a unique ID for each transaction
        this.transactionId = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    /**
     * A common method to simulate fetching transaction data from a source.
     */
    public void fetchTransactionDetails() {
        System.out.println("Fetching details for transaction " + transactionId + " of amount $" + String.format("%.2f", amount) + " on " + transactionDate);
    }

    /**
     * Abstract method for validating a transaction. Each subclass must provide
     * its own specific validation logic.
     */
    protected abstract void validate();

    /**
     * Abstract method for processing a transaction. Each subclass must provide
     * its own specific processing logic.
     */
    protected abstract void process();

    /**
     * The template method that defines the skeleton of the reconciliation algorithm.
     * It is marked as 'final' to prevent subclasses from overriding the sequence of steps.
     * This method orchestrates the calls to the other methods in a fixed order.
     */
    @Override
    public final void reconcile() {
        System.out.println("\n--- Reconciling Transaction ID: " + transactionId + " ---");
        fetchTransactionDetails();
        validate();
        process();
        System.out.println("--- Reconciliation Complete for " + transactionId + " ---");
    }
}