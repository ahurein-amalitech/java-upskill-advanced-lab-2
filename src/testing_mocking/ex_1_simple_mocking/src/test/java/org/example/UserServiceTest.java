package org.example;


import org.example.service.UserRepository;
import org.example.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

class UserServiceTest {
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userRepository = mock(UserRepository.class);

        userService = new UserService(userRepository);
    }

    @Test
    void testGetUser_WhenUserExists() {
        int userId = 1;
        String expectedUser = "ahurein";

        when(userRepository.findUserById(userId)).thenReturn(expectedUser);

        String actualUser = userService.getUser(userId);
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void testGetUser_WhenUserDoesNotExist() {
        int userId = 2;
        when(userRepository.findUserById(userId)).thenReturn(null);

        String actualUser = userService.getUser(userId);
        assertEquals("User not found", actualUser);

        verify(userRepository, times(1)).findUserById(userId);
    }
}
