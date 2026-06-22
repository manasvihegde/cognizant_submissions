package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceMockTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private User sampleUser;

    @BeforeEach
    void setUp() {
        sampleUser = new User(1, "Alice", "alice@example.com");
    }

    @Test
    void testGetUserById() {
        // Stub - tell mock what to return
        when(userRepository.findById(1)).thenReturn(sampleUser);

        // Act
        User result = userService.getUserById(1);

        // Assert
        assertEquals("Alice", result.getName());
        assertEquals("alice@example.com", result.getEmail());
    }

    @Test
    void testGetUserByIdNotFound() {
        when(userRepository.findById(99)).thenReturn(null);

        User result = userService.getUserById(99);

        assertNull(result);
    }

    @Test
    void testGetAllUsers() {
        List<User> mockList = Arrays.asList(
            new User(1, "Alice", "alice@example.com"),
            new User(2, "Bob", "bob@example.com")
        );
        when(userRepository.findAll()).thenReturn(mockList);

        List<User> result = userService.getAllUsers();

        assertEquals(2, result.size());
        assertEquals("Alice", result.get(0).getName());
    }

    @Test
    void testCreateUser() {
        when(userRepository.save(sampleUser)).thenReturn(sampleUser);

        User result = userService.createUser(sampleUser);

        assertEquals("Alice", result.getName());
    }

    @Test
    void testRepositoryThrowsException() {
        when(userRepository.findById(1)).thenThrow(new RuntimeException("DB error"));

        assertThrows(RuntimeException.class, () -> userService.getUserById(1));
    }
}