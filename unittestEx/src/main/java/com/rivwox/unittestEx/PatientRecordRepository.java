package com.rivwox.unittestEx;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientModel, Long> {

}
