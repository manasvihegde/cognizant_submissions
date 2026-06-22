package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    private StudentService studentService;

    @BeforeAll
    static void initAll() {
        System.out.println("Starting all tests...");
    }

    @BeforeEach
    void setUp() {
        
        studentService = new StudentService();
        studentService.addStudent("Alice");
        studentService.addStudent("Bob");
        System.out.println("Setup done");
    }

    @AfterEach
    void tearDown() {
        studentService.clear();
        System.out.println("Teardown done");
    }

    @AfterAll
    static void cleanUpAll() {
        System.out.println("All tests finished.");
    }

    @Test
    void testAddStudent() {
        
        String newStudent = "Charlie";

        
        studentService.addStudent(newStudent);

        
        assertEquals(3, studentService.getCount());
        assertTrue(studentService.getAllStudents().contains("Charlie"));
    }

    @Test
    void testGetCount() {
       
        int count = studentService.getCount();

        
        assertEquals(2, count);
    }

    @Test
    void testAddEmptyNameThrowsException() {
        
        String invalidName = "";

        
        assertThrows(IllegalArgumentException.class,
            () -> studentService.addStudent(invalidName));
    }

    @Test
    void testAddNullThrowsException() {
        
        assertThrows(IllegalArgumentException.class,
            () -> studentService.addStudent(null));
    }
}