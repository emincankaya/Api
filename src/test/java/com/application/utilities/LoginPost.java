package com.application.utilities;

public class LoginPost {
   private String LanguageCode;
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

    public String getLanguageCode() {
        return LanguageCode;
    }

    public void setLanguageCode(String languageCode) {
        LanguageCode = languageCode;
    }

    public void setEmailOrPhone(String emailOrPhone) {
        EmailOrPhone = emailOrPhone;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setAuthenticationCode(String authenticationCode) {
        AuthenticationCode = authenticationCode;
    }

    public void setSmsMobileKey(String smsMobileKey) {
        SmsMobileKey = smsMobileKey;
    }

    public String getEmailOrPhone() {
        return EmailOrPhone;
    }

    public String getPassword() {
        return Password;
    }

    public String getAuthenticationCode() {
        return AuthenticationCode;
    }

    public String getSmsMobileKey() {
        return SmsMobileKey;
    }
}
