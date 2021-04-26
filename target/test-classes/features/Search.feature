Feature: Search and place order for vegetables
@SeleniumTest
Scenario: Search for items and validate results
Given User is on GreenCart login page
When User searched for Cucumber vegetable
Then "Cucumber" results are displayed

@SeleniumTest1
Scenario: Search for items and then move to checkout page
Given User is on GreenCart login page
When User searched for "Brinjal" vegetable
And Added items to cart
And User proceed to checkout page for purchase
Then Verify selcted "Brinjal" items are displayed in the checkout page

@RegressionTest
Scenario Outline: Search for items and then move to checkout page
Given User is on GreenCart login page
When User searched for <Vegetable Name> vegetable
And Added items to cart
And User proceed to checkout page for purchase
Then Verify selcted <Vegetable Name> items are displayed in the check out page

Examples:
|Vegetable Name|
|Brinjal       |
|Beetroot      |