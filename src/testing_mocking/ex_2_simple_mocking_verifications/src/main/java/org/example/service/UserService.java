package org.example.service;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUser(int id) {
        String user = userRepository.findUserById(id);
        return user != null ? user : "User not found";
    }
}