package it.morfoza;

/**
 * Created by michalina on 31/08/16.
 */
public class User implements UserInterface {

    private String email;
    private String password;

    public User (String email, String password){

        this.email = email;
        this.password = password;
    }


    @Override
    public void isUserLoggedIn() {

    }
}
