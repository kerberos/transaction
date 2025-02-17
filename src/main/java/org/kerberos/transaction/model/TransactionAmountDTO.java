package org.kerberos.transaction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

/**
 * TransactionAmount
 */

@Builder
@JsonTypeName("Transaction_amount")
public class TransactionAmountDTO {

    private Optional<String> currency;

    private Optional<BigDecimal> value;

    /**
     * Get currency
     *
     * @return currency
     */

    @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("currency")
    public Optional<String> getCurrency() {
        return currency;
    }

    public TransactionAmountDTO value(BigDecimal value) {
        this.value = Optional.of(value);
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public Optional<BigDecimal> getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionAmountDTO transactionAmountDTO = (TransactionAmountDTO) o;
        return Objects.equals(this.currency, transactionAmountDTO.currency) &&
                Objects.equals(this.value, transactionAmountDTO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionAmount {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

