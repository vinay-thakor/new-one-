$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/risk/lexisnexis/resources/featurefiles/industry.feature");
formatter.feature({
  "line": 1,
  "name": "Choose your industry",
  "description": "",
  "id": "choose-your-industry",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20130941100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As user I can select product sign in",
  "description": "",
  "id": "choose-your-industry;as-user-i-can-select-product-sign-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on productSignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I will navigate to product sing in page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 464035900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnProductSignInLink()"
});
formatter.result({
  "duration": 501231700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iWillNavigateToProductSingInPage()"
});
formatter.result({
  "duration": 39500,
  "status": "passed"
});
formatter.after({
  "duration": 1570917400,
  "status": "passed"
});
});