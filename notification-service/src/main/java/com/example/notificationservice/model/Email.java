package com.example.notificationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Email implements Serializable {

    private final static String serialVersionUID = "241f234123";

    private String message;
    private String type;

    @Override
    public String toString() {
        return "Email{" +
                "message='" + message + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
