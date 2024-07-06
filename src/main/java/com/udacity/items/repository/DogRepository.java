package com.udacity.items.repository;

import org.springframework.data.repository.CrudRepository;

import com.udacity.items.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> { }


