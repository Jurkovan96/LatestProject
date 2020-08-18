package com.example.demo.Repository;

import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public Optional<User>  findByLastnameIsLike(String firstname);

    public Optional<User> findUserByEmailAndPassword(String email, String password);

    public Optional<User> findUserByEmail(String email);

    public Optional<User> findByUsername(String username);

}
