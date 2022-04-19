package com.example.travelcompany.services;

import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

public abstract class AbstractCrudService<E, P> implements CrudService<E, P>{

    private final JpaRepository<E, P> jpaRepository;

    public AbstractCrudService(
            JpaRepository<E, P> jpaRepository
    ) {
        this.jpaRepository = jpaRepository;
    }

    @NotNull
    public E save(
            @NotNull E entity) {
        return jpaRepository.save(entity);
    }

    @NotNull
    public Optional<E> findById(@NotNull P id) {
        return jpaRepository.findById(id);
    }

    public boolean existsById(@NotNull P p) {
        return jpaRepository.existsById(p);
    }

    public void deleteById(@NotNull P id) {
        delete(findById(id).orElseThrow(EntityNotFoundException::new));
    }

    public void delete(@NotNull E entity) {
        jpaRepository.delete(entity);
    }
}
