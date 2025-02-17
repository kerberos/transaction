package org.kerberos.transaction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.util.Objects;
import java.util.Optional;

/**
 * TransactionCounterPartyAccount
 */

@Builder
@JsonTypeName("Transaction_counterPartyAccount")
public class TransactionCounterPartyAccountDTO {

    private Optional<String> accountName;

    private Optional<String> accountNumber;

    private Optional<String> bankCode;

    /**
     * Get accountName
     *
     * @return accountName
     */

    @Schema(name = "accountName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("accountName")
    public Optional<String> getAccountName() {
        return accountName;
    }

    /**
     * Get accountNumber
     *
     * @return accountNumber
     */

    @Schema(name = "accountNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("accountNumber")
    public Optional<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get bankCode
     *
     * @return bankCode
     */

    @Schema(name = "bankCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bankCode")
    public Optional<String> getBankCode() {
        return bankCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionCounterPartyAccountDTO transactionCounterPartyAccountDTO = (TransactionCounterPartyAccountDTO) o;
        return Objects.equals(this.accountName, transactionCounterPartyAccountDTO.accountName) &&
                Objects.equals(this.accountNumber, transactionCounterPartyAccountDTO.accountNumber) &&
                Objects.equals(this.bankCode, transactionCounterPartyAccountDTO.bankCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, accountNumber, bankCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionCounterPartyAccount {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
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

