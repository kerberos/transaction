package org.kerberos.transaction.helper;

import org.kerberos.transaction.data.Transaction;
import org.kerberos.transaction.model.TransactionAmountDTO;
import org.kerberos.transaction.model.TransactionCounterPartyAccountDTO;
import org.kerberos.transaction.model.TransactionDTO;
import org.kerberos.transaction.model.TransactionDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MapperDTO {
    public TransactionDTO toDto(Transaction t) {
        return TransactionDTO.builder()
                .amount(Optional.ofNullable(toTransactionAmountDto(t)))
                .bankref(Optional.ofNullable(t.getBankref()))
                .bookingDate(Optional.ofNullable(t.getBookingDate()))
                .counterPartyAccount(Optional.ofNullable(transactionCounterPartyAccountDTO(t)))
                .creditDebitIndicator(Optional.ofNullable(toCreditDebitIndicatorEnum(t)))
                .details(Optional.ofNullable(toTransactionDetailsDto(t)))
                .id(Optional.of(t.getId().toString()))
                .ownAccountNumber(Optional.ofNullable(t.getOwnAccountNumber()))
                .postingDate(Optional.ofNullable(t.getPostingDate()))
                .productBankRef(Optional.ofNullable(t.getProductBankRef()))
                .specificSymbol(Optional.ofNullable(t.getSpecificSymbol()))
                .statementNumber(Optional.ofNullable(t.getStatement().getNumber()))
                .statementPeriod(Optional.ofNullable(t.getStatement().getPeriod()))
                .transactionId(Optional.ofNullable(t.getTransactionId()))
                .transactionType(Optional.ofNullable(t.getTransactionType().getType()))
                .transactionTypeCode(Optional.ofNullable(t.getTransactionType().getCode()))
                .variableSymbol(Optional.ofNullable(t.getVariableSymbol()))
                .build();
    }

    private static TransactionDTO.CreditDebitIndicatorEnum toCreditDebitIndicatorEnum(Transaction t) {
        return TransactionDTO.CreditDebitIndicatorEnum.valueOf(t.getCreditDebitIndicator());
    }

    private TransactionDetailsDTO toTransactionDetailsDto(Transaction t) {
        return TransactionDetailsDTO.builder()
                .detail1(Optional.ofNullable(t.getDetail1()))
                .build();
    }

    private TransactionCounterPartyAccountDTO transactionCounterPartyAccountDTO(Transaction t) {
        return TransactionCounterPartyAccountDTO.builder()
                .accountName(Optional.ofNullable(t.getCounterPartyAccount().getName()))
                .accountNumber(Optional.ofNullable(t.getCounterPartyAccount().getNumber()))
                .bankCode(Optional.ofNullable(t.getCounterPartyAccount().getCode()))
                .build();
    }

    private TransactionAmountDTO toTransactionAmountDto(Transaction t) {
        return TransactionAmountDTO.builder()
                .currency(Optional.ofNullable(t.getCurrency()))
                .value(Optional.ofNullable(t.getAmount()))
                .build();
    }
}
