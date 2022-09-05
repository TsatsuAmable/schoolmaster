/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.locode.apps.schoolmaster.auth.user.User;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Nonnull;
import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "roles",
        indexes = {
            @Index(name = "index_roles_on_code", columnList = "code"),
            @Index(name = "index_roles_on_name", columnList = "name")
        })
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role implements Serializable {

    @Id private int code;

    @Nonnull
    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Nonnull
    @Column(name = "created_by")
    private String createdBy;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    @Override
    public String toString() {
        return "Role{"
                + "code="
                + code
                + ", name='"
                + name
                + '\''
                + ", description='"
                + description
                + '\''
                + ", createdAt="
                + createdAt
                + ", updatedAt="
                + updatedAt
                + ", createdBy='"
                + createdBy
                + '\''
                + ", users="
                + users
                + '}';
    }
}
