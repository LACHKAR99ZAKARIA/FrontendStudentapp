package model;

import java.util.Date;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class users {
    private String _id;
    private String id;
    private String name;
    private roll rollUser;
    private String Email;
    private String password;
    private Date DateExpiration;

    public users() {

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public roll getRollUser() {
        return rollUser;
    }

    public void setRollUser(roll rollUser) {
        this.rollUser = rollUser;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateExpiration() {
        return DateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        DateExpiration = dateExpiration;
    }


}
