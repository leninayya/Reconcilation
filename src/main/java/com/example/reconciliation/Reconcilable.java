package com.example.reconciliation;

/**
 * Interface defining the contract for any transaction that can be reconciled.
 * This ensures that any object implementing it will have a reconcile method.
 */
public interface Reconcilable {
    /**
     * The core method to start the reconciliation process for a transaction.
     */
    void reconcile();
}