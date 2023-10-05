package org.factoriaf5.comicbooks.roles;

import java.util.List;

import org.factoriaf5.comicbooks.genres.Genre;
import org.factoriaf5.comicbooks.genres.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
      RoleRepository  repository;

    @Autowired
    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

     public List<Role> getAll() {
        List<Role> role = repository.findAll();
        return role;
    }


}
