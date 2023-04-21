package com.samere.crucial.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ErrorResponse {
    private int status;
    private String message;
    private long timestamp;

}

