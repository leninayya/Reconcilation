package com.example.reconciliation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankCheckTransactionTest {

    @Test
    void testBankCheckTransactionFields() {
        BankCheckTransaction tx = new BankCheckTransaction(200.0, "2025-09-23", "CHK-1001");
        assertEquals(200.0, tx.amount);
        assertEquals("2025-09-23", tx.transactionDate);
    }

    @Test
    void testBankCheckTransactionReconcile() {
        BankCheckTransaction tx = new BankCheckTransaction(200.0, "2025-09-23", "CHK-1001");
        assertDoesNotThrow(tx::reconcile);
    }
}