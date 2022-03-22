package com.application.utilities;

import io.cucumber.java.it.Data;

public class LoginPost {

    /*private String LanguageCode;
    private String EmailOrPhone;
    private String Password;
    private String AuthenticationCode;
    private String SmsMobileKey;


     public LoginPost(String languageCode, String emailOrPhone, String password, String authenticationCode, String smsMobileKey) {
         LanguageCode = languageCode;
         EmailOrPhone = emailOrPhone;
         Password = password;
         AuthenticationCode = authenticationCode;
         SmsMobileKey = smsMobileKey;
     }

    */
    private String LanguageCode;
    private String EmailOrPhone;
    private String Password;
    private String AuthenticationCode;
    private String SmsMobileKey;


    /**
     * @param EmailOrPhone
     * @param LanguageCode
     * @param Password
     * @param AuthenticationCode
     * @param SmsMobileKey
     */
    public LoginPost(String EmailOrPhone, String LanguageCode, String Password, String AuthenticationCode, String SmsMobileKey) {
        this.LanguageCode = LanguageCode;
        this.EmailOrPhone = EmailOrPhone;
        this.Password = Password;
        this.AuthenticationCode = AuthenticationCode;
        this.SmsMobileKey = SmsMobileKey;


    }
}