package com.example.reconciliation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    static class TestTransaction extends Transaction {
        boolean validated = false;
        boolean processed = false;

        TestTransaction(double amount, String date) {
            super(amount, date);
        }

        @Override
        protected void validate() {
            validated = true;
        }

        @Override
        protected void process() {
            processed = true;
        }
    }

    @Test
    void testTransactionReconcileCallsValidateAndProcess() {
        TestTransaction tx = new TestTransaction(100.0, "2025-09-21");
        tx.reconcile();
        assertTrue(tx.validated, "validate() should be called");
        assertTrue(tx.processed, "process() should be called");
    }

    @Test
    void testFetchTransactionDetails() {
        TestTransaction tx = new TestTransaction(50.5, "2025-09-22");
        assertDoesNotThrow(tx::fetchTransactionDetails);
    }
}