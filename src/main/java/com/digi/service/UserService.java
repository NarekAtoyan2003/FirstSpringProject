package com.digi.service;

import com.digi.model.User;
import com.digi.model.UserDTO;

import java.util.List;

public interface UserService {

    public List<User> get();

    public List<User> getByName(String name);

    public List<User> getByAgeBetween(int minAge, int maxAge);

    public void save(UserDTO dto);
    public void deleteByID(int id);

    public void update(int id, User user);
}
