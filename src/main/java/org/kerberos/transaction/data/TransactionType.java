package org.kerberos.transaction.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "transactiontype")
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trxtypeid", nullable = false)
    private Long id;

    @Nationalized
    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "code", nullable = false)
    private Integer code;

}