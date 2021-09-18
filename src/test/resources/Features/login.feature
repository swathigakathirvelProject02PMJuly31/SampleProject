Feature: To search the products in the amazon App

Background: 
Given The user should successfully log into home page

@smoke 
Scenario: To search the products and add to cart1
When The user should search the products in search in textbox
And The user should select the products as"iphone"


@sanity
Scenario: To search the products and add to cart2
When The user should search the products in searchtextbox
Then the user should get the product name"redmi9"