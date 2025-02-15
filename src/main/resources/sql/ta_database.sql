-- MS SQL server
CREATE TABLE [transaction](
	[trxId]                    [bigint] IDENTITY(1000,1) NOT NULL,
	[amount]                   [numeric](19, 2)    NOT NULL,
	[currency]                 [nvarchar](3)       NOT NULL,
	[id]                       [nvarchar](20)      NOT NULL,
	[bankref]                  [nvarchar](20)      NOT NULL,
	[transactionId]            [nvarchar](20)      NOT NULL,        
	[bookingDate]              [date]              NULL,
	[postingDate]              [date]              NOT NULL,
	[creditDebitIndicator]     [varchar](4)        NULL,
	[ownAccountNumber]         [nvarchar](20)      NULL,
	[counterPartyAccount]      [bigint]            NOT NULL,
	[detail1]                  [nvarchar](50)      NULL,
	[detail2]                  [nvarchar](50)      NULL,
	[detail3]                  [nvarchar](50)      NULL,
	[detail4]                  [nvarchar](50)      NULL,
	[productBankRef]           [nvarchar](50)      NULL,
	[transactionType]          [bigint]            NOT NULL,
	[statement]                [bigint]            NOT NULL,   
	[constantSymbol]           [varchar](10)       NULL,
	[specificSymbol]           [varchar](10)       NULL,    
	[variableSymbol]           [varchar](10)       NULL
);

CREATE TABLE [transactionType](
	[trxTypeId]                [bigint] IDENTITY(1000,1) NOT NULL,
	[type]                     [nvarchar](20)            NOT NULL,
	[code]                     [int]                     NOT NULL
);

CREATE TABLE [statement](
	[statementId]              [bigint] IDENTITY(1000,1) NOT NULL,
	[number]                   [nvarchar](20)            NOT NULL,
	[period]                   [nvarchar](20)            NOT NULL,
	[description]              [nvarchar](1000)          NULL
);

CREATE TABLE [account](
	[accountId]              [bigint] IDENTITY(1000,1) NOT NULL,
	[name]                   [nvarchar](50)            NOT NULL,
	[number]                 [nvarchar](20)            NOT NULL,
	[code]                   [nvarchar](4)             NOT NULL
);

ALTER TABLE [transaction]
    ADD CONSTRAINT PK_transaction_trxId PRIMARY KEY (trxId);

ALTER TABLE [transactionType]
    ADD CONSTRAINT PK_transactionType_trxTypeId PRIMARY KEY (trxTypeId);

ALTER TABLE [statement]
    ADD CONSTRAINT PK_statement_statementId PRIMARY KEY (statementId);

ALTER TABLE [account]
    ADD CONSTRAINT PK_account_accountId PRIMARY KEY (accountId);


-- insert scripts START
INSERT INTO transactionType (type, code) VALUES
                                             ('Payment', 1),
                                             ('Refund', 2),
                                             ('Transfer', 3),
                                             ('Charge', 4),
                                             ('Withdrawal', 5);

INSERT INTO statement (number, period, description) VALUES
                                                        ('2025/01/001', '2025-01', 'January Statement 2025'),
                                                        ('2025/02/001', '2025-02', 'February Statement 2025'),
                                                        ('2025/03/001', '2025-03', 'March Statement 2025'),
                                                        ('2025/04/001', '2025-04', 'April Statement 2025'),
                                                        ('2025/05/001', '2025-05', 'May Statement 2025');

INSERT INTO account (name, number, code) VALUES
                                             ('Account A', '1234567890', 'AB01'),
                                             ('Account B', '9876543210', 'CD02'),
                                             ('Account C', '5555555555', 'EF03'),
                                             ('Account D', '6666666666', 'GH04'),
                                             ('Account E', '7777777777', 'IJ05');

INSERT INTO [transaction]
(amount, currency, [id], bankref, transactionId, bookingDate, postingDate, creditDebitIndicator, ownAccountNumber, counterPartyAccount, detail1, detail2, detail3, detail4, productBankRef, transactionType, statement, constantSymbol, specificSymbol, variableSymbol)
VALUES
    (1000.00, 'CZK', 'TRX001', 'BANKREF001', 'TXN001', '2025-01-01', '2025-01-01', 'CRDT', '1234567890', 1001, 'Payment for services', NULL, NULL, NULL, 'Product01', 1001, 1001, 'CST001', 'SPEC001', 'VAR001'),
    (2000.00, 'CZK', 'TRX002', 'BANKREF002', 'TXN002', '2025-01-05', '2025-01-05', 'DBIT', '9876543210', 1002, 'Refund for product', NULL, NULL, NULL, 'Product02', 1002, 1001, 'CST002', 'SPEC002', 'VAR002'),
    (1500.00, 'CZK', 'TRX003', 'BANKREF003', 'TXN003', '2025-01-10', '2025-01-10', 'CRDT', '5555555555', 1003, 'Transfer to another account', NULL, NULL, NULL, 'Product03', 1003, 1002, 'CST003', 'SPEC003', 'VAR003'),
    (300.00, 'CZK', 'TRX004', 'BANKREF004', 'TXN004', '2025-01-15', '2025-01-15', 'DBIT', '6666666666', 1004, 'Charge for account maintenance', NULL, NULL, NULL, 'Product04', 1004, 1002, 'CST004', 'SPEC004', 'VAR004'),
    (5000.00, 'CZK', 'TRX005', 'BANKREF005', 'TXN005', '2025-01-20', '2025-01-20', 'CRDT', '7777777777', 1000, 'Withdrawal from ATM', NULL, NULL, NULL, 'Product05', 1000, 1003, 'CST005', 'SPEC005', 'VAR005'),
    (1200.00, 'CZK', 'TRX006', 'BANKREF006', 'TXN006', '2025-02-01', '2025-02-01', 'DBIT', '1234567890', 1001, 'Payment for goods', NULL, NULL, NULL, 'Product06', 1001, 1002, 'CST006', 'SPEC006', 'VAR006'),
    (700.00, 'CZK', 'TRX007', 'BANKREF007', 'TXN007', '2025-02-05', '2025-02-05', 'CRDT', '9876543210', 1002, 'Refund for service', NULL, NULL, NULL, 'Product07', 1002, 1003, 'CST007', 'SPEC007', 'VAR007'),
    (2500.00, 'CZK', 'TRX008', 'BANKREF008', 'TXN008', '2025-02-10', '2025-02-10', 'DBIT', '5555555555', 1003, 'Transfer from another account', NULL, NULL, NULL, 'Product08', 1003, 1003, 'CST008', 'SPEC008', 'VAR008'),
    (400.00, 'CZK', 'TRX009', 'BANKREF009', 'TXN009', '2025-02-15', '2025-02-15', 'CRDT', '6666666666', 1004, 'Charge for transfer', NULL, NULL, NULL, 'Product09', 1004, 1004, 'CST009', 'SPEC009', 'VAR009'),
    (8000.00, 'CZK', 'TRX010', 'BANKREF010', 'TXN010', '2025-02-20', '2025-02-20', 'DBIT', '7777777777', 1000, 'Withdrawal for travel expenses', NULL, NULL, NULL, 'Product10', 1000, 1004, 'CST010', 'SPEC010', 'VAR010'),
    (1500.00, 'CZK', 'TRX011', 'BANKREF011', 'TXN011', '2025-03-01', '2025-03-01', 'CRDT', '1234567890', 1001, 'Payment for subscription', NULL, NULL, NULL, 'Product11', 1001, 1003, 'CST011', 'SPEC011', 'VAR011'),
    (2200.00, 'CZK', 'TRX012', 'BANKREF012', 'TXN012', '2025-03-05', '2025-03-05', 'DBIT', '9876543210', 1002, 'Refund for overcharge', NULL, NULL, NULL, 'Product12', 1002, 1004, 'CST012', 'SPEC012', 'VAR012'),
    (1700.00, 'CZK', 'TRX013', 'BANKREF013', 'TXN013', '2025-03-10', '2025-03-10', 'CRDT', '5555555555', 1003, 'Transfer received', NULL, NULL, NULL, 'Product13', 1003, 1004, 'CST013', 'SPEC013', 'VAR013'),
    (600.00, 'CZK', 'TRX014', 'BANKREF014', 'TXN014', '2025-03-15', '2025-03-15', 'DBIT', '6666666666', 1004, 'Charge for late payment', NULL, NULL, NULL, 'Product14', 1004, 1000, 'CST014', 'SPEC014', 'VAR014'),
    (9000.00, 'CZK', 'TRX015', 'BANKREF015', 'TXN015', '2025-03-20', '2025-03-20', 'CRDT', '7777777777', 1000, 'Withdrawal for investment', NULL, NULL, NULL, 'Product15', 1000, 1000, 'CST015', 'SPEC015', 'VAR015');

-- insert scripts END



ALTER TABLE [transaction] 
    ADD CONSTRAINT FK_transaction_counterPartyAccount FOREIGN KEY (counterPartyAccount) REFERENCES account(accountId);

ALTER TABLE [transaction] 
    ADD CONSTRAINT FK_transaction_transactionType FOREIGN KEY (transactionType) REFERENCES transactionType(trxTypeId);

ALTER TABLE [transaction] 
    ADD CONSTRAINT FK_transaction_statement FOREIGN KEY (statement) REFERENCES statement(statementId);
