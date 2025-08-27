package com.example.SpringSecurity.model;

import com.example.SpringSecurity.enums.Role;
import com.example.SpringSecurity.model.Abstraction.BaseEntity;
import com.example.SpringSecurity.model.Abstraction.SoftDelete;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.*;
import org.hibernate.envers.Audited;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name = "users")
@SQLDelete(sql = "UPDATE users SET deleted = true, deleted_at = CURRENT_TIMESTAMP WHERE id = ?")
@SQLRestriction("deleted = false")
@Filter(name = "deletedFilter", condition = "deleted = :isDeleted")
public class User extends SoftDelete {
    @Column(nullable = false)
    private String fullName;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private HistoryLogin historyLogin;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
