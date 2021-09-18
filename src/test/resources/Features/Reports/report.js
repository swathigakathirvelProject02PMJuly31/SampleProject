$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To search the products in the amazon App",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should successfully log into home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_successfully_log_into_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To search the products and add to cart1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user should search the products in search in textbox",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_should_search_the_products_in_search_in_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should select the products as\"iphone\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_should_select_the_products_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should successfully log into home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_successfully_log_into_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To search the products and add to cart2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should search the products in searchtextbox",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_should_search_the_products_in_searchtextbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get the product name\"redmi9\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_get_the_product_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});