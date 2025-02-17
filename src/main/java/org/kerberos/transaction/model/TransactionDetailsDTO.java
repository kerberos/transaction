package org.kerberos.transaction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.util.Objects;
import java.util.Optional;

/**
 * TransactionDetails
 */
@Builder
@JsonTypeName("Transaction_details")
public class TransactionDetailsDTO {

    private Optional<String> detail1;

    /**
     * Get detail1
     *
     * @return detail1
     */

    @Schema(name = "detail1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("detail1")
    public Optional<String> getDetail1() {
        return detail1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionDetailsDTO transactionDetailsDTO = (TransactionDetailsDTO) o;
        return Objects.equals(this.detail1, transactionDetailsDTO.detail1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionDetails {\n");
        sb.append("    detail1: ").append(toIndentedString(detail1)).append("\n");
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

