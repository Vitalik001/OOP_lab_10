package org.example.task3;

public class DataBase extends БазаДаних{

    public String getUserInfo(){
        return super.отриматиДаніКористувача();
    }

    public String getStaticInfo(){
        return super.отриматиСтатистичніДані();
    }

}
