package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Define custom queries if needed
}
