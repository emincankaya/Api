package com.application.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

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
        LoginPost loginPost=new LoginPost("tr","5523040725","Kuleli_07","","");

       Response response= given().log().all().and().header("Host","<calculated when request is sent>").header("Content-Type","application/json")
                .and().header("apiToken","nkM+r4QxK0END2A9p/DpzV4dZ6uTbBcKjSBNYLv1LwVAUQkrW77FzGc3TqsO/v4Et0mVhNhD0rk2nkTumHwSrinxv3NxnXUKAy83JZ8D2zJeAv/gd6W2pyqaJYlrLuZoMOOwxuAW2GOi0Bj7jdg1MGOnpU2z2+iRiRiwttJgVJHv94BHtYMVbpWFtwcXqsQg")
                .and()
                .body(loginPost)
                .when().post("https://cedtradingapi-staging.bitci.com/api/Accountv2/login");









        String finalToken = "Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjc2NvZGUiOiI0MzMzMjAiLCJhdXRoY29kZSI6ImI5ZDllYmJlNWI2ZGFiYWI4ZDg4NDIyYjE5MTM3YzM4MzU2NGYzYzMiLCJleGNoYW5nZUlkIjoiZGYxYWUwNTYtY2I5MC00OTE2LWFmZDUtMTI1MThjODc2Y2RmIiwibXVzdFBhc3N3b3JkQ2hhbmdlIjoiRmFsc2UiLCJ1bmlxdWVfbmFtZSI6IjQzMzMyMCIsIm5iZiI6MTY0Nzg2NjUxMCwiZXhwIjoxNjQ4NDcxMzEwLCJpYXQiOjE2NDc4NjY1MTAsImlzcyI6IlRyYWRpbmdQbGF0Zm9ybS5BcGkiLCJhdWQiOiJUcmFkaW5nUGxhdGZvcm0ifQ.gFwcyIEc7p2tpmOKT7gfmxx-c6xgw8FbnLXSHY87ZXo";
        System.out.println("finalToken = " + finalToken);

        return finalToken;
    }




    }