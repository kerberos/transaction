package org.kerberos.transaction.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "\"transaction\"")
public class Transaction {
    @Id
    @Column(name = "trxId", nullable = false)
    private Long id;

    @Column(name = "amount", nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;

    @Nationalized
    @Column(name = "currency", nullable = false, length = 3)
    private String currency;

    @Nationalized
    @Column(name = "id", nullable = false, length = 20)
    private String id1;

    @Nationalized
    @Column(name = "bankref", nullable = false, length = 20)
    private String bankref;

    @Nationalized
    @Column(name = "transactionId", nullable = false, length = 20)
    private String transactionId;

    @Column(name = "bookingDate")
    private LocalDate bookingDate;

    @Column(name = "postingDate", nullable = false)
    private LocalDate postingDate;

    @Column(name = "creditDebitIndicator", length = 4)
    private String creditDebitIndicator;

    @Nationalized
    @Column(name = "ownAccountNumber", length = 20)
    private String ownAccountNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "counterPartyAccount", nullable = false)
    private Account counterPartyAccount;

    @Nationalized
    @Column(name = "detail1", length = 50)
    private String detail1;

    @Nationalized
    @Column(name = "detail2", length = 50)
    private String detail2;

    @Nationalized
    @Column(name = "detail3", length = 50)
    private String detail3;

    @Nationalized
    @Column(name = "detail4", length = 50)
    private String detail4;

    @Nationalized
    @Column(name = "productBankRef", length = 50)
    private String productBankRef;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transactionType", nullable = false)
    private TransactionType transactionType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "statement", nullable = false)
    private Statement statement;

    @Column(name = "constantSymbol", length = 10)
    private String constantSymbol;

    @Column(name = "specificSymbol", length = 10)
    private String specificSymbol;

    @Column(name = "variableSymbol", length = 10)
    private String variableSymbol;

}