package com.yolo.hgj;

import org.junit.jupiter.api.Test;

import com.yolo.hgj.entity.Student;

public class StudentTest {
    @Test
    void study() {
        Student student = new Student("202209512217", 20, 3);
        student.study();
    }

    @Test
    void examination() {
        Student student = new Student(, 20, 3);
        student.examination();
    }

    @Test
    void tell() {
        Student student = new Student(1, 20, 3);
        student.tell();
    }
}
