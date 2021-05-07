Feature: Adding items to cart
  
@CartTest
Scenario: Adding items to cart
   Given User is on shopping page
   When User cleared shopping cart
   When User selected "Books" from categories
   Then User selected a book from the list displayed
   And Enter the qutatinty more than one
   When User clicked on "Add to cart"
   Then Validate "The product has been added to your shopping cart" message
   
@CartTest
Scenario: Validating items in cart
   Given User is on cart page
   When User validated subtotal price for the selected book 
   Then User clicked on agree terms and conditions
   When User clciked on checkout button
   
@CartTest
Scenario: User is on payment page
   Given  User is on payment page
   When User clicked on billing address dropdown 
   When User slected billing and shipping address are same
   Then User selected shipping method as Next Day Air
   And User clicked on continue
   When User selcted payment method as COD (Cash on delivery)
   Then User validated message as "You will pay by COD"
   When User clicked on confirm order
   Then print the order number
   And click on continue
   Then logout from appilication
   
   
   
 