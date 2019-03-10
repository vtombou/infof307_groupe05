package bean;

public class User {
    // Attributs de User
    private String email;
    private String password;
    private String login;

    public User(String email, String password, String login){
        this.email = email;
        this.password  = password;
        this.login = login;
    }

    //getteurs
    public String getEmail(){
        return this.email;
    }
    public String getLogin(){
        return this.login;
    }
    public String getPassword(){
        return this.password;
    }

    //setteurs
    public void setEmail(String email){
        this.email = email;
    }
    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
