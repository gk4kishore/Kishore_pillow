Feature: Verifying End to End checkout flow for purchasing "Pillow"

Background: User is Logged In
	  When User open demo midtrans website
    Then User clicks on Buy button
    Then User clicks on CheckOut button
    Then User clicks on Continue button
    Then User select credit card option
   

Scenario Outline: Verifying Successful payment
	  Then User enters valid Card Number "<CardNumber>"
    Then User enters valid Expiry Date "<ExpiryDate>"
    Then User enters valid CVV Number "<CVVNumber>"
    Then User clicks on Pay Now button
    Then User enters Password "<Password>"
    Then User clicks on ok button
    
    Examples: 
    | CardNumber          | ExpiryDate | CVVNumber | Password |
    | 4811 1111 1111 1114 | 12/24      | 123       | 112233   |

Scenario Outline: Verifying Failed payment
	  Then I enter Card Number "<CardNumber>"
    Then I enter invalid Expiry Date "<ExpiryDate>"
    Then I enter CVV Number "<CVVNumber>"
    Then I click on PayNow button
    Then I enter Password "<Password>"
    Then I click on okbutton
    
    Examples: 
    | CardNumber          | ExpiryDate | CVVNumber | Password |
    | 4911 1111 1111 1113 | 12/20      | 123       | 112233   |
    
    