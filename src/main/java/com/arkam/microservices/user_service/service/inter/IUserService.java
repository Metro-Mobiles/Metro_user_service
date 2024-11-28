package com.arkam.microservices.user_service.service.inter;

import com.arkam.microservices.user_service.DTO.LoginRequest;
import com.arkam.microservices.user_service.DTO.Response;
import com.arkam.microservices.user_service.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();


    Response deleteUser(String userId);

    Response getUserById(String userId);

    Boolean findedByUsersId(Long userID);

    Response getMyInfo(String email);

}