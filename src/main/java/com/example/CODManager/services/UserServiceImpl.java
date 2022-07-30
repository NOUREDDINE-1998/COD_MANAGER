package com.example.CODManager.services;

import com.example.CODManager.entities.User;
import com.example.CODManager.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;

    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long userId, User user) {
        User currentUser = this.getUser(userId);
        currentUser.setFullName(user.getFullName());
        currentUser.setCity_(user.getCity_());
        currentUser.setRegion(user.getRegion());
        currentUser.setPhone(user.getPhone());

        return userRepository.save(currentUser);

    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
