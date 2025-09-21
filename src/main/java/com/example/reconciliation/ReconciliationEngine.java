package com.example.reconciliation;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class that drives the simulation. It demonstrates polymorphism by
 * processing a list of different transaction types through a common interface.
 */
public class ReconciliationEngine {
    public static void main(String[] args) {
        System.out.println("===== Starting the Financial Reconciliation Engine =====");

        // A list to hold different types of transactions.
        List<Transaction> transactions = new ArrayList<>();

        // Add different transaction types to the list
        transactions.add(new BankCheckTransaction(150.75, "2025-09-20", "CHK-1024"));
        transactions.add(new CreditCardTransaction(89.99, "2025-09-21", "4111-2222-3333-4444", "John Doe"));
        transactions.add(new BankCheckTransaction(1200.00, "2025-09-21", "CHK-1025"));
        transactions.add(new CreditCardTransaction(45.50, "2025-09-22", "5555-6666-7777-8888", "Jane Smith"));

        // Process each transaction using the same method call.
        for (Transaction tx : transactions) {
            tx.reconcile();
        }

        System.out.println("\n===== All transactions have been processed. =====");
    }
}