package com.e_commerce.training.e_commerce.entity;

import com.e_commerce.training.e_commerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole userRole;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;


}
