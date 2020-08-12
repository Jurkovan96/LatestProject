package com.example.demo.Service;

import com.example.demo.Config.ExceptionHandler;
import com.example.demo.Models.Comments;
import com.example.demo.Models.User;
import com.example.demo.Repository.CommentRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Security.MyUserDetails;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class UserService implements UserDetailsService {


    private final String userNamePattern = "^[aA-zZ]\\w{5,10}$";
    private final String passwordPattern = "";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentRepository commentRepository;


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public boolean saveValidUser(User user) throws ValidationException {
        if (checkUserEmailAvailable(user.getEmail())) {
            this.saveUser(user);
            return true;
        } else throw new ValidationException("");
    }


    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    public User getById(long id) {
        Optional<User> user = userRepository.findById(id);

        return ((User) user.get());

    }


    public User findByName(String name) {
        Optional<User> user = userRepository.findByLastnameIsLike(name);
        return ((User) user.get());

    }

    public User findByEmailAndPassword(String email, String password) throws ValidationException {
        Optional<User> user = userRepository.findUserByEmailAndPassword(email, password);
        if (user.equals(null)) {
            throw new ValidationException("Email or password are not correct!");
        }
        return ((User) user.get());

    }

    //????
    public List<User> toList(Optional<User> opt) {
        return opt.isPresent()
                ? Collections.singletonList(opt.get())
                : Collections.emptyList();
    }


    public void saveCommnets(Comments comments) {
        commentRepository.save(comments);
    }

    public void setTheComments(User user) {
        user.setCommentsList(commentRepository.getAllByUser(user));
    }


    public boolean checkCredentials(String email, String password) {
        String checkPassword = this.getUserByEmail(email).getPassword();
        String checkEmailAddress = this.getUserByEmail(email).getEmail();
        if (checkEmailAddress.matches(email) && checkPassword.matches(password)) {
            return true;
        } else throw new ExceptionHandler("NoUser");

    }

    public boolean checkUserEmailAvailable(String email) throws HandlerException {
        if (!this.getUserByEmail(email).equals(null)) {
            return true;
        } else
            throw new ExceptionHandler("EmailTaken");
    }

//    public boolean checkUserByNames(String firstName, String lastName){
//        String fullName = firstName.concat(lastName);
//        if(fullName.matches(getAllUsers()))
// 
//    }


    public User getUserByEmail(String email) {
        Optional<User> user = userRepository.findUserByEmail(email);
        return ((User) user.get());
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws ExceptionHandler {
        Optional<User> user = userRepository.findUserByEmail(email);

        user.orElseThrow(() -> new ExceptionHandler("email"));

        return user.map(MyUserDetails::new).get();
    }


//    public boolean checkCredentialsFormat(User user){
//        if(user.getFirstname().matches(userNamePattern) || user.getFirstname().matches()){return true;}
//        else throw new ExceptionHandler("Invalid.Username");
//
//        if(user.getPassword().matches(passwordPattern) || )
//    }


}

