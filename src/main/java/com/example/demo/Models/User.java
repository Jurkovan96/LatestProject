package com.example.demo.Models;



import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "user_name")
    private String username;

    @Column(name = "joined_date")
    private Timestamp dateadded;

    @Column(name = "role")
    private String role;

    @Column(name = "email")
    @Email
   // @NotBlank(message =  "{email.invalid}")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "validation")
    private boolean accountSet;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAccountSet() {
        return accountSet;
    }

    public void setAccountSet(boolean accountSet) {
        this.accountSet = accountSet;
    }

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Comments> commentsList;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Timestamp getDateadded() {
        return dateadded;
    }

    public void setDateadded(Timestamp dateadded) {
        this.dateadded = dateadded;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }
}