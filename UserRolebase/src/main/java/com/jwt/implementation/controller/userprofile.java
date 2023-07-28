package com.jwt.implementation.controller;

import com.jwt.implementation.config.JwtGeneratorValidator;
import com.jwt.implementation.model.User;

import com.jwt.implementation.repository.UserRepository;
import com.jwt.implementation.service.DefaultUserService;
import com.jwt.implementation.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.web.bind.annotation.*;
/*

import java.util.List;

@RestController
@RequestMapping("/user/api")
public class userprofile {
        @Autowired
        private UserServiceImpl daoService;

        @Autowired
        UserRepository userRepo;

        @Autowired
        AuthenticationManager authManager;

        @Autowired
        JwtGeneratorValidator jwtGenVal;


        @Autowired
        DefaultUserService userService;
        @GetMapping("/profile")
        public ResponseEntity<User> readUser() {

            return new ResponseEntity<User>(daoService.readUser(), HttpStatus.OK);
        }
        //@PreAuthorize("hasAuthority('ROLE_USER')")
        @PutMapping("/updateprofile")
        public ResponseEntity<User> updateUser(@RequestBody User user) {
            return new ResponseEntity<User>(daoService.updateUser(user), HttpStatus.OK);
        }
        //@PreAuthorize("hasAuthority('ROLE_USER')")
        @DeleteMapping("/deactivate")
        public ResponseEntity<HttpStatus> deleteUser() {
            daoService.deleteUser();
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        }
        //@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_ADMIN')")
        @GetMapping("/getAll")
        public ResponseEntity<List<User>> getAllClaim() {
            List<User> claim = daoService.getAllUsers();
            return new ResponseEntity<>(claim, HttpStatus.OK);

        }
}*/
