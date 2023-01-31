package model;

import android.text.Editable;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIService {
    public String prefix="api";

    @GET(prefix+"/users")
    Call<ResponseBody> getUsers();

    @GET(prefix+"/user")
    Call<ResponseBody> getUsers(@Path("id") String id);

    @DELETE(prefix+"/user")
    Call<ResponseBody> deletUsers(@Path("id") String id);

    @POST(prefix+"/users")
    Call<ResponseBody> addUser(@Body users users);

    @PUT(prefix+"/users")
    Call<ResponseBody> updateUser(@Body users users);

    @POST(prefix+"/auth/login")
    Call<ResponseBody> login(@Body Editable email, @Body Editable password);

    @GET(prefix+"/auth/islogin")
    Call<ResponseBody> isLogin();

    @GET(prefix+"/auth/logout")
    Call<ResponseBody> logout();
}
