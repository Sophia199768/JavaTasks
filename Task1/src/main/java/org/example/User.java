package org.example;

import java.util.Date;

public class User {
    private String login;
    private Date birthday;
    private String password;
    private static final String role;

    static {
        role = "User";
    }

    public User(String login, Date birthday, String password) {
        this.birthday = birthday;
        this.login = login;
        this.password = password;
    }


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
