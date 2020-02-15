package com.thoughtworks;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("张龙");
        teacher.addStudent(new Student("张三", "001", "2019.02.11"));
        teacher.addStudent(new Student("李四", "002", "2019.02.10"));
        teacher.addStudent(new Student("王五", "001", "2019.02.09"));

      List<Student> duplicateStudents = teacher.duplicate();
      for (Student duplicateStudent : duplicateStudents) {
        System.out.println(duplicateStudent);
      }
    }
}
