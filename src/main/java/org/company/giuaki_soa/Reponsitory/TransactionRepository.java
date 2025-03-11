package org.company.giuaki_soa.Reponsitory;

import org.company.giuaki_soa.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}