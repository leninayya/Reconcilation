package com.example.reconciliation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTransactionTest {

    @Test
    void testCreditCardTransactionFields() {
        CreditCardTransaction tx = new CreditCardTransaction(300.0, "2025-09-23", "4111-2222-3333-4444", "John Doe");
        assertEquals(300.0, tx.amount);
        assertEquals("2025-09-23", tx.transactionDate);
    }

    @Test
    void testCreditCardTransactionReconcile() {
        CreditCardTransaction tx = new CreditCardTransaction(300.0, "2025-09-23", "4111-2222-3333-4444", "John Doe");
        assertDoesNotThrow(tx::reconcile);
    }
}