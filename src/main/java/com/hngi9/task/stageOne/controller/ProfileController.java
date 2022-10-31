package com.hngi9.task.stageOne.controller;

import com.hngi9.task.stageOne.model.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/profile/")
public class ProfileController {

    @GetMapping("get-user-profile")
    public ResponseEntity<Profile> getUserProfile(){
        return new ResponseEntity<>(Profile.builder()
                .slackUsername("saucekode")
                .backend(true)
                .age(26)
                .bio("Chiamaka Mbah is a smart and intentional Software Engineer with " +
                    "proven ability to leverage full-stack expertise to build scalable systems. " +
                    "Eager to learn and constantly improve my skill set through targeted mentorship and " +
                    "challenging projects.")
                .build(), HttpStatus.OK);
    }
}
