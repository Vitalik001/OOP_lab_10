package org.example.task2;

import java.time.LocalDate;

public class Login {
    User Login(String authentication){
        if (authentication == "Facebook"){
            return new FacebookToUserAdapter(new FacebookUser("dobosevych@gmail.com", Country.Ukraine, LocalDate.parse("2022.12.12, 12:33")));
        }
        if (authentication == "Twitter"){
            return new TwitterToUserAdapter(new TwitterUser("dobosevych@gmail.com", "Ukraine", "2022.12.12, 14:44"));
        }

        return null;
    }
}
