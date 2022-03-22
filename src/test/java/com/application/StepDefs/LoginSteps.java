package com.application.StepDefs;

import com.application.utilities.Authantication;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class LoginSteps {


    @Then("user logged with valid phone number credentials")
    public void user_logged_with_valid_phone_number_credentials() {
        Authantication.generateToken();

    }

    @Then("user can get coin list from api")
    public void userCanGetCoinListFromApi() {

        ValidatableResponse response=given().header("Authorization",Authantication.generateToken()).header("apiToken","nkM+r4QxK0END2A9p/DpzV4dZ6uTbBcKjSBNYLv1LwVAUQkrW77FzGc3TqsO/v4Et0mVhNhD0rk2nkTumHwSrin" +
                "xv3NxnXUKAy83JZ8D2zJeAv/gd6W2pyqaJYlrLuZoMOOwxuAW2GOi0Bj7jdg1MGOnpU2z2+iRiRiwttJgVJHv94BHtYMVbpWFtwcXqsQg").accept(ContentType.JSON)
                .get("https://cedtradingapi-staging.bitci.com/api/Coin/CoinList").then().statusCode(200);

        JsonPath jsonPath=response.extract().jsonPath();
        jsonPath.prettyPrint();




    }
}
