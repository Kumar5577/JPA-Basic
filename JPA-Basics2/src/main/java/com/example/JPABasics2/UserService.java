package com.example.JPABasics2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
    UserRepository userRepository;
public String addUser(User user){
    userRepository.save(user);
    return "user added";
}
public List<User> getUsers(){
    return userRepository.findAll();
}
public User getUser(int id){
    return userRepository.findById(id).get();
}

}
