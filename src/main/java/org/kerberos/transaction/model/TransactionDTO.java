package org.kerberos.transaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

/**
 * Transaction
 */

@Builder
public class TransactionDTO {

    private Optional<TransactionAmountDTO> amount;

    private Optional<String> bankref;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Optional<LocalDate> bookingDate;

    private Optional<TransactionCounterPartyAccountDTO> counterPartyAccount;

    /**
     * Gets or Sets creditDebitIndicator
     */
    public enum CreditDebitIndicatorEnum {
        CRDT("CRDT"),

        DBIT("DBIT");

        private final String value;

        CreditDebitIndicatorEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CreditDebitIndicatorEnum fromValue(String value) {
            for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<CreditDebitIndicatorEnum> creditDebitIndicator;

    private Optional<TransactionDetailsDTO> details;

    private Optional<String> id;

    private Optional<String> ownAccountNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Optional<LocalDate> postingDate;

    private Optional<String> productBankRef;

    private Optional<String> specificSymbol;

    private Optional<String> statementNumber;

    private Optional<String> statementPeriod;

    private Optional<String> transactionId;

    private Optional<String> transactionType;

    private Optional<Integer> transactionTypeCode;

    private Optional<String> variableSymbol;

    /**
     * Get amount
     *
     * @return amount
     */
    @Valid
    @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("amount")
    public Optional<TransactionAmountDTO> getAmount() {
        return amount;
    }

    /**
     * Get bankref
     *
     * @return bankref
     */

    @Schema(name = "bankref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bankref")
    public Optional<String> getBankref() {
        return bankref;
    }

    /**
     * Get bookingDate
     *
     * @return bookingDate
     */
    @Valid
    @Schema(name = "bookingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bookingDate")
    public Optional<LocalDate> getBookingDate() {
        return bookingDate;
    }

    /**
     * Get counterPartyAccount
     *
     * @return counterPartyAccount
     */
    @Valid
    @Schema(name = "counterPartyAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("counterPartyAccount")
    public Optional<TransactionCounterPartyAccountDTO> getCounterPartyAccount() {
        return counterPartyAccount;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     */

    @Schema(name = "creditDebitIndicator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("creditDebitIndicator")
    public Optional<CreditDebitIndicatorEnum> getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Get details
     *
     * @return details
     */
    @Valid
    @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("details")
    public Optional<TransactionDetailsDTO> getDetails() {
        return details;
    }

    public TransactionDTO id(String id) {
        this.id = Optional.of(id);
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */

    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * Get ownAccountNumber
     *
     * @return ownAccountNumber
     */

    @Schema(name = "ownAccountNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ownAccountNumber")
    public Optional<String> getOwnAccountNumber() {
        return ownAccountNumber;
    }

    /**
     * Get postingDate
     *
     * @return postingDate
     */
    @Valid
    @Schema(name = "postingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("postingDate")
    public Optional<LocalDate> getPostingDate() {
        return postingDate;
    }

    /**
     * Get productBankRef
     *
     * @return productBankRef
     */

    @Schema(name = "productBankRef", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("productBankRef")
    public Optional<String> getProductBankRef() {
        return productBankRef;
    }

    /**
     * Get specificSymbol
     *
     * @return specificSymbol
     */

    @Schema(name = "specificSymbol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("specificSymbol")
    public Optional<String> getSpecificSymbol() {
        return specificSymbol;
    }

    /**
     * Get statementNumber
     *
     * @return statementNumber
     */

    @Schema(name = "statementNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statementNumber")
    public Optional<String> getStatementNumber() {
        return statementNumber;
    }

    /**
     * Get statementPeriod
     *
     * @return statementPeriod
     */

    @Schema(name = "statementPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statementPeriod")
    public Optional<String> getStatementPeriod() {
        return statementPeriod;
    }

    /**
     * Get transactionId
     *
     * @return transactionId
     */

    @Schema(name = "transactionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transactionId")
    public Optional<String> getTransactionId() {
        return transactionId;
    }

    /**
     * Get transactionType
     *
     * @return transactionType
     */

    @Schema(name = "transactionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transactionType")
    public Optional<String> getTransactionType() {
        return transactionType;
    }

    /**
     * Get transactionTypeCode
     *
     * @return transactionTypeCode
     */

    @Schema(name = "transactionTypeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transactionTypeCode")
    public Optional<Integer> getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Get variableSymbol
     *
     * @return variableSymbol
     */

    @Schema(name = "variableSymbol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("variableSymbol")
    public Optional<String> getVariableSymbol() {
        return variableSymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionDTO transactionDTO = (TransactionDTO) o;
        return Objects.equals(this.amount, transactionDTO.amount) &&
                Objects.equals(this.bankref, transactionDTO.bankref) &&
                Objects.equals(this.bookingDate, transactionDTO.bookingDate) &&
                Objects.equals(this.counterPartyAccount, transactionDTO.counterPartyAccount) &&
                Objects.equals(this.creditDebitIndicator, transactionDTO.creditDebitIndicator) &&
                Objects.equals(this.details, transactionDTO.details) &&
                Objects.equals(this.id, transactionDTO.id) &&
                Objects.equals(this.ownAccountNumber, transactionDTO.ownAccountNumber) &&
                Objects.equals(this.postingDate, transactionDTO.postingDate) &&
                Objects.equals(this.productBankRef, transactionDTO.productBankRef) &&
                Objects.equals(this.specificSymbol, transactionDTO.specificSymbol) &&
                Objects.equals(this.statementNumber, transactionDTO.statementNumber) &&
                Objects.equals(this.statementPeriod, transactionDTO.statementPeriod) &&
                Objects.equals(this.transactionId, transactionDTO.transactionId) &&
                Objects.equals(this.transactionType, transactionDTO.transactionType) &&
                Objects.equals(this.transactionTypeCode, transactionDTO.transactionTypeCode) &&
                Objects.equals(this.variableSymbol, transactionDTO.variableSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, bankref, bookingDate, counterPartyAccount, creditDebitIndicator, details, id, ownAccountNumber, postingDate, productBankRef, specificSymbol, statementNumber, statementPeriod, transactionId, transactionType, transactionTypeCode, variableSymbol);
    }

    @Override
    public String toString() {
        String sb = "class Transaction {\n" +
                "    amount: " + toIndentedString(amount) + "\n" +
                "    bankref: " + toIndentedString(bankref) + "\n" +
                "    bookingDate: " + toIndentedString(bookingDate) + "\n" +
                "    counterPartyAccount: " + toIndentedString(counterPartyAccount) + "\n" +
                "    creditDebitIndicator: " + toIndentedString(creditDebitIndicator) + "\n" +
                "    details: " + toIndentedString(details) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    ownAccountNumber: " + toIndentedString(ownAccountNumber) + "\n" +
                "    postingDate: " + toIndentedString(postingDate) + "\n" +
                "    productBankRef: " + toIndentedString(productBankRef) + "\n" +
                "    specificSymbol: " + toIndentedString(specificSymbol) + "\n" +
                "    statementNumber: " + toIndentedString(statementNumber) + "\n" +
                "    statementPeriod: " + toIndentedString(statementPeriod) + "\n" +
                "    transactionId: " + toIndentedString(transactionId) + "\n" +
                "    transactionType: " + toIndentedString(transactionType) + "\n" +
                "    transactionTypeCode: " + toIndentedString(transactionTypeCode) + "\n" +
                "    variableSymbol: " + toIndentedString(variableSymbol) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

