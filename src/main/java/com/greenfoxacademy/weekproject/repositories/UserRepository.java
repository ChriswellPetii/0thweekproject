package com.greenfoxacademy.weekproject.repositories;

import com.greenfoxacademy.weekproject.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
