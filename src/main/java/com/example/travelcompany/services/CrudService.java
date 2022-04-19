package com.example.travelcompany.services;

import com.sun.istack.NotNull;

import java.util.List;
import java.util.Optional;

public interface CrudService<E, P> {

    @NotNull
    E save(@NotNull E entity);

    @NotNull
    Optional<E> findById(@NotNull P id);

    boolean existsById(@NotNull P p);

    void deleteById(@NotNull P id);

    void delete(@NotNull E entity);

    List<E> findAll();

}
