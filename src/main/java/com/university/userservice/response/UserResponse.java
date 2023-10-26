package com.university.userservice.response;

import lombok.Data;

@Data
public class UserResponse {

    private Integer userId;
    private String firstname;
    private String lastname;
    private Integer age;
    private String email;
    private String mobile;
    private String city;
}
