package com.douglas.budgeting.infrastructure.http.request;

import com.douglas.budgeting.application.input.PersistTransactionInput;
import com.douglas.budgeting.domain.Category;

public record TransactionRequest(String description, Category category, long amount) {
    public PersistTransactionInput toInput() {
        return new PersistTransactionInput(description, amount, category);
    }
}