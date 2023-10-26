package com.university.userservice.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UserRequest {

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @Positive
    private Integer age;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String mobile;

    @NotEmpty
    private String city;
}
