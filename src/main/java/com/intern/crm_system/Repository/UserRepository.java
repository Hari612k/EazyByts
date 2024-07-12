package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom queries if needed
}
