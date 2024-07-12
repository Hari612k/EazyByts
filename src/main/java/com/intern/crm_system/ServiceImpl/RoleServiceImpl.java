package com.intern.crm_system.ServiceImpl;

import com.intern.crm_system.Entity.Role;
import com.intern.crm_system.Repository.RoleRepository;
import com.intern.crm_system.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
}
