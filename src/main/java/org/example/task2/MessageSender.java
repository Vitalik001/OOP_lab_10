package org.example.task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MessageSender {

    public void send(String text, User user, String country){
        if (ChronoUnit.MINUTES.between(user.getActivetime(), LocalDate.now()) > 60 || country != user.getCountry())
            return;
        user.sendmessage(text);
    }
}
