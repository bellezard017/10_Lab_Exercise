package com.appdev.scanergy.temperaturag3.repository;

import com.appdev.scanergy.temperaturag3.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

    List<PaymentEntity> findByUserID(Long userID);

    List<PaymentEntity> findByEventID(Long eventID);

    PaymentEntity findByTransactionReference(String transactionReference);
}
