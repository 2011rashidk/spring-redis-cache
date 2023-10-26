package com.university.userservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
public class Response {

    private HttpStatus httpStatus;
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;
}
