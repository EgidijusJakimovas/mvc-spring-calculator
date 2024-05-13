package com.spring.calculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    public enum UserRole {
        ADMIN,
        USER
    }

    public String getAuthorities() {
        return role.toString();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @NotNull(message = "username cannot be null")
    @NotEmpty(message = "username cannot be blank")
    @Column(name = "user_name")
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRole role;

    @Email(message = "Enter a valid email address")
    @NotNull(message = "email cannot be null")
    @NotEmpty(message = "email cannot be blank")
    @Column(name = "email")
    private String email;

    @NotNull(message = "password cannot be null")
    @NotEmpty(message = "password cannot be blank")
    @Column(name = "password")
    private String password;

    @Transient
    @NotBlank(message = "Password confirmation is required")
    private String passwordConfirm;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordConfirm='" + passwordConfirm + '\'' +
                '}';
    }
}
