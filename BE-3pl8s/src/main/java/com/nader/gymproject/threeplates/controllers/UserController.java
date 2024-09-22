package com.nader.gymproject.threeplates.controllers;

import com.nader.gymproject.threeplates.domain.dtos.LoginDTO;
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
