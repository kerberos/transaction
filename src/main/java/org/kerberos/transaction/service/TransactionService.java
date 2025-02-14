package org.kerberos.transaction.service;

import org.kerberos.transaction.repository.TransactionRepository;
import org.kerberos.transaction.data.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getTransactions(String accountNumber) {
        return transactionRepository.findByOwnAccountNumber(accountNumber);
    }
}
