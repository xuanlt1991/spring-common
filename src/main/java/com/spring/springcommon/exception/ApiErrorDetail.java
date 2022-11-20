package com.spring.springcommon.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiErrorDetails implements Serializable {
    private String code;
    private String fieldName;
    private String message;
}
