package aula1.demo.domain.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, length = 100, name = "first_name")
  private String firstName;

  @Column(nullable = false, length = 100, name = "last_name")
  private String lastName;

  @Column(nullable = false, length = 11, unique = true)
  private String cpf;

  @Column(nullable = false, name = "birth_date")
  private Date birthDate;

  @Column(nullable = false, length = 50, unique = true)
  private String email;

  @Column(nullable = false, length = 50)
  private String password;

  private Date createdAt;
  private Date updatedAt;
}