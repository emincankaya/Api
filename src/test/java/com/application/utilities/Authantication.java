package com.application.utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class Authantication {
    private Authantication() {

    }

    // InheritableThreadLocal  --> this is like a container, bag, pool.
    // in this pool we can have separate objects for each thread
    // for each thread, in InheritableThreadLocal we can have separate object for that thread


    public  static String generateToken(){
        final LoginPost loginPost = new LoginPost("5523040725", "tr", "Kuleli_07", "", "");
        ValidatableResponse response=
        given().contentType(ContentType.JSON).header("apiToken", "nkM+r4QxK0END2A9p/DpzV4dZ6uTbBcKjSBNYLv1LwVAUQkrW77FzGc3TqsO/v4Et0mVhNhD0rk2nkTumHwSrinxv3NxnXUKAy83JZ8D2zJeAv/gd6W2pyqaJYlrLuZoMOOwxuAW2GOi0Bj7jdg1MGOnpU2z2+iRiRiwttJgVJHv94BHtYMVbpWFtwcXqsQg")
                .body(loginPost).when()
                .post("https://cedtradingapi-staging.bitci.com/api/Accountv2/login")
                .then ()
                .assertThat ()
                .statusCode (200)
                .log ()
                .all ();

        System.out.println("loginpost = " + loginPost);


        JsonPath jsonPath=response.extract().jsonPath();


        String token=jsonPath.get("Token");




        String finalToken = "Bearer "+token;
        System.out.println("finalToken = " + finalToken);
        return finalToken;
    }




    }