package org.kerberos.transaction.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "statement")
public class Statement {
    @Id
    @Column(name = "statementId", nullable = false)
    private Long id;

    @Nationalized
    @Column(name = "number", nullable = false, length = 20)
    private String number;

    @Nationalized
    @Column(name = "period", nullable = false, length = 20)
    private String period;

    @Nationalized
    @Column(name = "description", length = 1000)
    private String description;

}