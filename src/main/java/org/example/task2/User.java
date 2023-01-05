package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String mail;
    private String country;
    private LocalDate activetime;

    void sendmessage(String message){
        System.out.println(message);
    }

}
