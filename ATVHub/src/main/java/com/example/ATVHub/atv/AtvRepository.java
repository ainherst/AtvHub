package com.example.ATVHub.atv;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //This interface is responsible for data access
public interface AtvRepository extends JpaRepository<Atv, Long> {
}
