package com.example.reconciliation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReconciliationEngineTest {

    @Test
    void testReconciliationEngineMain() {
        assertDoesNotThrow(() -> ReconciliationEngine.main(new String[]{}));
    }
}