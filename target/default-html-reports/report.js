$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login/login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that user can login with valid phone number credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user logged with valid phone number credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_logged_with_valid_phone_number_credentials()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.application.StepDefs.LoginSteps.user_logged_with_valid_phone_number_credentials(LoginSteps.java:16)\r\n\tat ✽.user logged with valid phone number credentials(file:src/test/resources/features/Login/login.feature:4)\r\n",
  "status": "failed"
});
});