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

import java.util.List;

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
    @Column(name = "id")
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

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Number> calculationsList;

    public List<Number> getNumbers() {
        return calculationsList;
    }

    public void setNumbers(List<Number> calculationsList) {
        this.calculationsList = calculationsList;
    }

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
