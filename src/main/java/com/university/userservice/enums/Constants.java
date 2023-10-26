package com.university.userservice.enums;

public enum Constants {

    USER_REQUEST("user_request: {}"),
    USER_CREATED("User created successfully"),
    USER_ID("userId: {}"),
    USER_UPDATED("User updated successfully"),
    USER_RESPONSE("userResponse: {}"),
    USER_NOT_FOUND("User not found"),
    EXCEPTION("Exception: {}");
    private final String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
