package org.example.task2;

import java.time.LocalDate;

public class TwitterToUserAdapter extends User{

    TwitterToUserAdapter(TwitterUser user){
        super(user.getUserMail(), user.getCountry(), LocalDate.parse(user.getLastActiveTime()));
    }


}
