package com.developer.LabReport.user;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserid(Long userid);

    @Transactional
    void deleteByUserid(Long userid);
}
