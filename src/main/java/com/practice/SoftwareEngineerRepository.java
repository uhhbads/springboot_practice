package com.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {
}