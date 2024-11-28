package com.arkam.microservices.user_service.controller;

import com.arkam.microservices.user_service.DTO.LoginRequest;
import com.arkam.microservices.user_service.DTO.Response;
import com.arkam.microservices.user_service.DTO.UserID;
import com.arkam.microservices.user_service.entity.User;
import com.arkam.microservices.user_service.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final IUserService userService;

    public AuthController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody User user) {
        System.out.println("ArkamController");

        Response response = userService.register(user);
        return ResponseEntity.status(response.getStatusCode()).body(response);

    }

    @GetMapping("/retriveByUserId")
    public Boolean checkUserId(@RequestParam Long userID){
        return userService.findedByUsersId(userID);
    }
    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginRequest loginRequest) {
        Response response = userService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);

    }

}
