package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<String, List<Student>> students;//尽量不要用map

    public Teacher(String name) {
        this.name = name;
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            List<Student> students = this.students.getOrDefault(student.getNumber(), new ArrayList<>());
            students.add(student);
            this.students.put(student.getNumber(), students);
        }
    }

    public List<Student> duplicate() {
        List<Student> duplicateStudents = new ArrayList<>();
        for (List<Student> students : this.students.values()) {
            if (students.size() > 1) {
                duplicateStudents.addAll(students);
            }
        }
        return duplicateStudents;
    }
}
