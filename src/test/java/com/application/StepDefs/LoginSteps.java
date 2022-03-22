package com.application.StepDefs;

import com.application.utilities.Authantication;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;

import static io.restassured.RestAssured.given;


public class LoginSteps {
    Response response;

    @Then("user logged with valid phone number credentials")
    public void user_logged_with_valid_phone_number_credentials() {
        response=     given().accept(ContentType.JSON)
                .and()
                .header("Authorization",Authantication.generateToken())
                .when()
                .post("https://cedtradingapi-staging.bitci.com/api/Accountv2/login");


        Assert.assertEquals(200,response.statusCode());


    }
}
