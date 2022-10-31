package com.hngi9.task.stageOne.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Profile {
    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;
}
