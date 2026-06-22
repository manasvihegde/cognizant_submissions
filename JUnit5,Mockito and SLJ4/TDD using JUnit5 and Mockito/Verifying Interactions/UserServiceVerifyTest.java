package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceVerifyTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void testFindByIdCalledOnce() {
        User user = new User(1, "Alice", "alice@example.com");
        when(userRepository.findById(1)).thenReturn(user);

        userService.getUserById(1);

        
        verify(userRepository, times(1)).findById(1);
    }

    @Test
    void testFindByIdNeverCalledWithWrongId() {
        User user = new User(1, "Alice", "alice@example.com");
        when(userRepository.findById(1)).thenReturn(user);

        userService.getUserById(1);

        
        verify(userRepository, never()).findById(99);
    }

    @Test
    void testFindAllCalledOnce() {
        userService.getAllUsers();

        verify(userRepository, times(1)).findAll();
    }

    @Test
    void testNoMoreInteractions() {
        User user = new User(1, "Alice", "alice@example.com");
        when(userRepository.findById(1)).thenReturn(user);

        userService.getUserById(1);

        verify(userRepository).findById(1);
        
        verifyNoMoreInteractions(userRepository);
    }

    @Test
    void testVerifyWithArgumentMatchers() {
        User user = new User(1, "Alice", "alice@example.com");
        when(userRepository.findById(anyInt())).thenReturn(user);

        userService.getUserById(42);

        verify(userRepository).findById(anyInt());
    }

    @Test
    void testVerifyCallOrder() {
        User user = new User(1, "Alice", "alice@example.com");
        when(userRepository.findById(1)).thenReturn(user);

        userService.getUserById(1);
        userService.getAllUsers();

        
        InOrder inOrder = inOrder(userRepository);
        inOrder.verify(userRepository).findById(1);
        inOrder.verify(userRepository).findAll();
    }
}