package com.e_commerce.training.e_commerce.entity;

import com.e_commerce.training.e_commerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

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

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public byte[] getImg() {
        return img;
    }
}
