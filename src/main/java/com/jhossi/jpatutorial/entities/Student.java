package com.jhossi.jpatutorial.entities;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student", uniqueConstraints = @UniqueConstraint(name = "email_unique", columnNames = "email_address"))
public class Student {

  @Id
  @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
  private Long id;
  private String firstName;
  private String lastName;

  @Column(name = "email_address", nullable = false)
  private String emailId;
  
  @Embedded
  private Guardian guardian;
}
