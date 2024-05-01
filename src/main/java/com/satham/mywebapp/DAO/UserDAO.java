package com.satham.mywebapp.DAO;

import org.springframework.data.repository.CrudRepository;

import com.satham.mywebapp.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
