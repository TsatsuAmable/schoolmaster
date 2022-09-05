/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {}
