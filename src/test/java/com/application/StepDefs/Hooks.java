package com.application.StepDefs;

import com.application.utilities.Authantication;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before("@api")
    public void dbHook() {
        System.out.println("api connection started");
        Authantication.generateToken();


    }

    @After("@api")
    public void afterDbHook() {
        System.out.println("api connection");


    }
}
