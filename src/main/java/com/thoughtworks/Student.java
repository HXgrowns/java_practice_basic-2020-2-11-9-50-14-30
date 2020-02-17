package com.thoughtworks;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private String number;
    private LocalDate enrollmentDate;

    private static final DateTimeFormatter ENROLLMENT_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private static final DateTimeFormatter OUTPUT_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

    public Student(String name, String number, String enrollmentDate) {
        this.name = name;
        this.number = number;
        this.enrollmentDate = LocalDate.parse(enrollmentDate, ENROLLMENT_FORMATTER);
    }

    @Override
    public String toString() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(this.enrollmentDate, currentDate);

        return String.format("我叫%s，我的学号是%s，%s入学，学龄%d年",
                this.name, this.number, OUTPUT_FORMATTER.format(enrollmentDate), period.getYears());
    }

    public String getNumber() {
        return number;
    }
}
