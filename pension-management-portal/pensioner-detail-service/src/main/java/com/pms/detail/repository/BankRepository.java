package com.pms.detail.repository;

import com.pms.detail.model.BankLog;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * This repository interface is used for accessing bank log table
 */
@Repository
@Transactional
public interface BankRepository extends JpaRepository<BankLog, Long> {
    Optional<BankLog> findByAadhaarNumber(long aadhaarNumber);
}
