package com.digi.service;

import com.digi.model.Status;
import com.digi.model.User;
import com.digi.model.UserDTO;
import com.digi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired/*kancuma u talisa userRepository - i bean*/
    private UserRepository userRepository;
    @Override
    public List<User> get() {
        List<User> all = userRepository.findAll();
        return all;
    }

    @Override
    public List<User> getByName(String name) {
        return userRepository.getByName(name);
    }

    @Override
    public List<User> getByAgeBetween(int minAge, int maxAge) {
        return userRepository.getByAgeBetween(minAge,maxAge);
    }

    @Override
    public void save(UserDTO dto) {
        User user = new User();
        user.setId(0);
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setAge(dto.getAge());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setVerification_code("");
        user.setStatus(Status.ACTIVE);

        userRepository.save(user);
    }

    @Override
    public void deleteByID(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(int id, User user) {


    }


}
