package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<String, List<Student>> num2students;

    public Teacher(String name) {
        this.name = name;
        this.num2students = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            List<Student> students = this.num2students.getOrDefault(student.getNum(), new ArrayList<>());
            students.add(student);
            this.num2students.put(student.getNum(), students);
        }
    }

    public List<Student> duplicate() {
        List<Student> duplicateStudents = new ArrayList<>();
        for (List<Student> students : this.num2students.values()) {
            if (students.size() > 1) {
                duplicateStudents.addAll(students);
            }
        }
        return duplicateStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<Student>> getNum2students() {
        return num2students;
    }

    public void setNum2students(Map<String, List<Student>> num2students) {
        this.num2students = num2students;
    }
}
