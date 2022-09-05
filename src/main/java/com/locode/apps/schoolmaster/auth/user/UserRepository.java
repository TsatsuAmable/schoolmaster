/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.auth.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository
        extends PagingAndSortingRepository<User, String>, JpaSpecificationExecutor<User> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
