package com.jhossi.jpatutorial.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jhossi.jpatutorial.entities.Guardian;
import com.jhossi.jpatutorial.entities.Student;

@SpringBootTest
public class StudentRepositoryTest {

  @Autowired
  private StudentRepository studentRepository;

  @Test
  public void saveStudent() {
    Guardian guardian = new Guardian("Teca", "teca@gmail.com", "912 345 678");
    Student student = Student.builder()
        .emailId("hossi@gmail.com")
        .firstName("João")
        .lastName("Hossi")
        .guardian(guardian)       
        .build();
    studentRepository.save(student);
  }

  @Test
  public void printAllStudents() {
    List<Student> studentList = studentRepository.findAll();
    System.out.println(studentList);
  }
}
