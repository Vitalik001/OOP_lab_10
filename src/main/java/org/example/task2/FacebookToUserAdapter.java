package org.example.task2;

public class FacebookToUserAdapter extends User{

    FacebookToUserAdapter(FacebookUser user){
        super(user.getEmail(), user.getUserCountry().name(), user.getGetUserActiveTime());
    }


}
