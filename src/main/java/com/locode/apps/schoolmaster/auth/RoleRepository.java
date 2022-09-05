/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.auth;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository
        extends PagingAndSortingRepository<Role, String>, JpaSpecificationExecutor<Role> {

    Optional<Role> findByCode(int code);

    Optional<Role> findByName(String name);
}
