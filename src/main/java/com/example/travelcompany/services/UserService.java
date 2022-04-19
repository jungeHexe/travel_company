package com.example.travelcompany.services;

import com.example.travelcompany.db.entity.User;
import org.springframework.stereotype.Service;
import com.example.travelcompany.db.repository.UserRepository;

import java.util.List;

@Service
public class UserService extends AbstractCrudService<User, Long>
        implements CrudService<User,Long>{

    private final UserRepository repository;

    public UserService(
            UserRepository repository
    ) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }
}
