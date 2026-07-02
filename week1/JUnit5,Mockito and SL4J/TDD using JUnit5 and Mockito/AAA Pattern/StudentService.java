package com.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        students.add(name);
    }

    public List<String> getAllStudents() {
        return students;
    }

    public int getCount() {
        return students.size();
    }

    public void clear() {
        students.clear();
    }
}