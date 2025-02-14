package org.kerberos.transaction.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId", nullable = false)
    private Long id;

    @Nationalized
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Nationalized
    @Column(name = "number", nullable = false, length = 20)
    private String number;

    @Nationalized
    @Column(name = "code", nullable = false, length = 4)
    private String code;

}