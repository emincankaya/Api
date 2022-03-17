package com.application.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jdk.nashorn.internal.parser.Token;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class Authantication {
    private Authantication() {

    }

    // InheritableThreadLocal  --> this is like a container, bag, pool.
    // in this pool we can have separate objects for each thread
    // for each thread, in InheritableThreadLocal we can have separate object for that thread


    public static String generateToken(){
        LoginPost loginPost=new LoginPost("tr","5523040725","Kuleli_007","","");

       Response response= given().log().all().and().header("Content-Length","<calculated when request is sent>").header("Host","<calculated when request is sent>")
                .and().header("apiToken","nkM+r4QxK0END2A9p/DpzV4dZ6uTbBcKjSBNYLv1LwVAUQkrW77FzGc3TqsO/v4Et0mVhNhD0rk2nkTumHwSrinxv3NxnXUKAy83JZ8D2zJeAv/gd6W2pyqaJYlrLuZoMOOwxuAW2GOi0Bj7jdg1MGOnpU2z2+iRiRiwttJgVJHv94BHtYMVbpWFtwcXqsQg")
                .accept(ContentType.JSON)
                .and()
                .contentType(ContentType.JSON)
                .body(loginPost)
                .when().post("https://cedtradingapi-staging.bitci.com/api/Accountv2/login");







        String token = response.path("Token");

        String finalToken = "Bearer "+ token;
        System.out.println("finalToken = " + finalToken);

        return finalToken;
    }




    }