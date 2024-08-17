package com.nader.gymproject.threeplates.controllers;

import com.nader.gymproject.threeplates.dtos.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping
    public String Login(@RequestBody LoginDTO loginDTO){

    }

    // TODO: public String Logout()
}
