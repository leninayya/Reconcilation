package com.example.reconciliation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReconcilableTest {
    static class DummyReconcilable implements Reconcilable {
        boolean called = false;
        @Override
        public void reconcile() {
            called = true;
        }
    }

    @Test
    void testReconcilableInterface() {
        DummyReconcilable dummy = new DummyReconcilable();
        dummy.reconcile();
        assertTrue(dummy.called, "reconcile() should be called on DummyReconcilable");
    }
}