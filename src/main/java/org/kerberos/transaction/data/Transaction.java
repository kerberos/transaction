package org.kerberos.transaction.data;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trxid", nullable = false)
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
    @Column(name = "transactionid", nullable = false, length = 20)
    private String transactionId;

    @Column(name = "bookingdate")
    private LocalDate bookingDate;

    @Column(name = "postingdate", nullable = false)
    private LocalDate postingDate;

    @Column(name = "creditdebitindicator", length = 4)
    private String creditDebitIndicator;

    @Nationalized
    @Column(name = "ownaccountnumber", length = 20)
    private String ownAccountNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "counterpartyaccount", nullable = false)
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
    @Column(name = "productbankref", length = 50)
    private String productBankRef;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transactiontype", nullable = false)
    private TransactionType transactionType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "statement", nullable = false)
    private Statement statement;

    @Column(name = "constantsymbol", length = 10)
    private String constantSymbol;

    @Column(name = "specificsymbol", length = 10)
    private String specificSymbol;

    @Column(name = "variablesymbol", length = 10)
    private String variableSymbol;

}