Feature: Adding product to cart for computer and component link
 Scenario: i want to Verify That User Should Build You Own Computer And Add Them To Cart Successfully(String processor, String ram,
  String hdd, String os, String software)
   Given i am on homepage of nopcommerce demo url
 When I Click on Computer tab
  And Click on Desktops link
 And I Click on product name "Build your own computer"
  And I select processor"<processor>"
  And I select ram"<ram>"
  And I select HDD"<hdd>"
  And I select operating system"<os>"
  And I click on Software"<software>"
  Then  I click on add ot cart
  And I  verify message "The product has been added to your shopping cart"


  | processor                                       | ram           | hdd               | os                      | software                   |
  | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

