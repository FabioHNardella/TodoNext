package br.todonext.todonext.service;

import br.todonext.todonext.entity.Role;
import br.todonext.todonext.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public Role getDefaultRole(){
        return repository.findByName("DEFAULT");
    }
    public Role getOwnerRole(){
        return repository.findByName("OWNER");
    }
    public Role getAdminRole(){
        return repository.findByName("ADMIN");
    }
}
