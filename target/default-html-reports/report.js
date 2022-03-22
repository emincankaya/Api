$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Coin/getCoinList.feature");
formatter.feature({
  "name": "Coin Func.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that user can get coin list from api",
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
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_logged_with_valid_phone_number_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can get coin list from api",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userCanGetCoinListFromApi()"
});
formatter.result({
  "status": "passed"
});
});