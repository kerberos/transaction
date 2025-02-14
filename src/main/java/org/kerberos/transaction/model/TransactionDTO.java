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

    private Optional<TransactionAmountDTO> amount = Optional.empty();

    private Optional<String> bankref = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Optional<LocalDate> bookingDate = Optional.empty();

    private Optional<TransactionCounterPartyAccountDTO> counterPartyAccount = Optional.empty();

    /**
     * Gets or Sets creditDebitIndicator
     */
    public enum CreditDebitIndicatorEnum {
        CRDT("CRDT"),

        DBIT("DBIT");

        private String value;

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

    private Optional<CreditDebitIndicatorEnum> creditDebitIndicator = Optional.empty();

    private Optional<TransactionDetailsDTO> details = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> ownAccountNumber = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Optional<LocalDate> postingDate = Optional.empty();

    private Optional<String> productBankRef = Optional.empty();

    private Optional<String> specificSymbol = Optional.empty();

    private Optional<String> statementNumber = Optional.empty();

    private Optional<String> statementPeriod = Optional.empty();

    private Optional<String> transactionId = Optional.empty();

    private Optional<String> transactionType = Optional.empty();

    private Optional<Integer> transactionTypeCode = Optional.empty();

    private Optional<String> variableSymbol = Optional.empty();

    public TransactionDTO amount(TransactionAmountDTO amount) {
        this.amount = Optional.of(amount);
        return this;
    }

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

    public void setAmount(Optional<TransactionAmountDTO> amount) {
        this.amount = amount;
    }

    public TransactionDTO bankref(String bankref) {
        this.bankref = Optional.of(bankref);
        return this;
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

    public void setBankref(Optional<String> bankref) {
        this.bankref = bankref;
    }

    public TransactionDTO bookingDate(LocalDate bookingDate) {
        this.bookingDate = Optional.of(bookingDate);
        return this;
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

    public void setBookingDate(Optional<LocalDate> bookingDate) {
        this.bookingDate = bookingDate;
    }

    public TransactionDTO counterPartyAccount(TransactionCounterPartyAccountDTO counterPartyAccount) {
        this.counterPartyAccount = Optional.of(counterPartyAccount);
        return this;
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

    public void setCounterPartyAccount(Optional<TransactionCounterPartyAccountDTO> counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    public TransactionDTO creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
        this.creditDebitIndicator = Optional.of(creditDebitIndicator);
        return this;
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

    public void setCreditDebitIndicator(Optional<CreditDebitIndicatorEnum> creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public TransactionDTO details(TransactionDetailsDTO details) {
        this.details = Optional.of(details);
        return this;
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

    public void setDetails(Optional<TransactionDetailsDTO> details) {
        this.details = details;
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

    public void setId(Optional<String> id) {
        this.id = id;
    }

    public TransactionDTO ownAccountNumber(String ownAccountNumber) {
        this.ownAccountNumber = Optional.of(ownAccountNumber);
        return this;
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

    public void setOwnAccountNumber(Optional<String> ownAccountNumber) {
        this.ownAccountNumber = ownAccountNumber;
    }

    public TransactionDTO postingDate(LocalDate postingDate) {
        this.postingDate = Optional.of(postingDate);
        return this;
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

    public void setPostingDate(Optional<LocalDate> postingDate) {
        this.postingDate = postingDate;
    }

    public TransactionDTO productBankRef(String productBankRef) {
        this.productBankRef = Optional.of(productBankRef);
        return this;
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

    public void setProductBankRef(Optional<String> productBankRef) {
        this.productBankRef = productBankRef;
    }

    public TransactionDTO specificSymbol(String specificSymbol) {
        this.specificSymbol = Optional.of(specificSymbol);
        return this;
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

    public void setSpecificSymbol(Optional<String> specificSymbol) {
        this.specificSymbol = specificSymbol;
    }

    public TransactionDTO statementNumber(String statementNumber) {
        this.statementNumber = Optional.of(statementNumber);
        return this;
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

    public void setStatementNumber(Optional<String> statementNumber) {
        this.statementNumber = statementNumber;
    }

    public TransactionDTO statementPeriod(String statementPeriod) {
        this.statementPeriod = Optional.of(statementPeriod);
        return this;
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

    public void setStatementPeriod(Optional<String> statementPeriod) {
        this.statementPeriod = statementPeriod;
    }

    public TransactionDTO transactionId(String transactionId) {
        this.transactionId = Optional.of(transactionId);
        return this;
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

    public void setTransactionId(Optional<String> transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionDTO transactionType(String transactionType) {
        this.transactionType = Optional.of(transactionType);
        return this;
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

    public void setTransactionType(Optional<String> transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionDTO transactionTypeCode(Integer transactionTypeCode) {
        this.transactionTypeCode = Optional.of(transactionTypeCode);
        return this;
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

    public void setTransactionTypeCode(Optional<Integer> transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public TransactionDTO variableSymbol(String variableSymbol) {
        this.variableSymbol = Optional.of(variableSymbol);
        return this;
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

    public void setVariableSymbol(Optional<String> variableSymbol) {
        this.variableSymbol = variableSymbol;
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
        StringBuilder sb = new StringBuilder();
        sb.append("class Transaction {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    bankref: ").append(toIndentedString(bankref)).append("\n");
        sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
        sb.append("    counterPartyAccount: ").append(toIndentedString(counterPartyAccount)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ownAccountNumber: ").append(toIndentedString(ownAccountNumber)).append("\n");
        sb.append("    postingDate: ").append(toIndentedString(postingDate)).append("\n");
        sb.append("    productBankRef: ").append(toIndentedString(productBankRef)).append("\n");
        sb.append("    specificSymbol: ").append(toIndentedString(specificSymbol)).append("\n");
        sb.append("    statementNumber: ").append(toIndentedString(statementNumber)).append("\n");
        sb.append("    statementPeriod: ").append(toIndentedString(statementPeriod)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
        sb.append("    variableSymbol: ").append(toIndentedString(variableSymbol)).append("\n");
        sb.append("}");
        return sb.toString();
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

