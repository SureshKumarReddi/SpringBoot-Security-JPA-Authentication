package com.Suresh.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Suresh.Models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
}
