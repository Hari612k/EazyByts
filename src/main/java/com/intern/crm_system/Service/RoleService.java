package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(Long id);
    Role saveRole(Role role);
    Role updateRole(Role role);
    void deleteRoleById(Long id);
    Role createRole(Role role);
}
