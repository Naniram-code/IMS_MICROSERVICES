package com.jwt.implementation.controller;
import com.jwt.implementation.model.User;
import com.jwt.implementation.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class UserController {

    @Autowired
    private UserServiceImpl daoService;


    @GetMapping("/profile")
    public ResponseEntity<User> readUser() {

        return new ResponseEntity<User>(daoService.readUser(), HttpStatus.OK);
    }

    @PutMapping("/profile")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<User>(daoService.updateUser(user), HttpStatus.OK);
    }

    @DeleteMapping("/deactivate")
    public ResponseEntity<HttpStatus> deleteUser() {
        daoService.deleteUser();
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
