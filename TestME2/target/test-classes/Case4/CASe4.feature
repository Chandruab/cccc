
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario: The One the user moves to the cart without adding an item
  Given Alex has registered into the TestMeApp
  When Alex search a particular item like headphone
  And try to proceed to the payment without adding any item in the cart
  Then TestMeApp doesn't display the cart icon
    
 

   