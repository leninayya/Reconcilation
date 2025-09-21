package com.example.reconciliation;

/**
 * A concrete class representing a transaction made via a credit card.
 * It extends the base Transaction class with card-specific details and logic.
 */
public class CreditCardTransaction extends Transaction {
    private String cardNumber;
    private String cardHolderName;

    /**
     * Constructor for CreditCardTransaction.
     */
    public CreditCardTransaction(double amount, String transactionDate, String cardNumber, String cardHolderName) {
        super(amount, transactionDate);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    protected void validate() {
        System.out.println("VALIDATING: Authorizing card number " + this.cardNumber + " for holder '" + this.cardHolderName + "'");
        System.out.println("VALIDATING: Checking card expiration date and CVV...");
    }

    @Override
    protected void process() {
        System.out.println("PROCESSING: Charging the credit card " + this.cardNumber + " and posting to the merchant account.");
    }
}