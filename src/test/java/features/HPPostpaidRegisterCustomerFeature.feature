Feature: HP Postpaid Registration

@Smoke @Regression
Scenario: HP Basic Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|
|196753621942|TestHP|English|770111778|090990099|4|
Then Customer Registered successfully message is displayed

@Smoke @Regression
Scenario: HP Silver Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|
|196753627117|TestHP|English|770111978|090990099|5|
Then Customer Registered successfully message is displayed

@hppostpaidregnew
Scenario: HP Gold Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|
|196753627113|TestHP|English|770809074|090990099|6|
Then Customer Registered successfully message is displayed

@hppostpaidregnew
Scenario: HP Basic with spouse Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|
|196753627114|TestHP|English|770983574|770990099|4|Testspouse|
Then Customer Registered successfully message is displayed

@hppostpaidregnew
Scenario: HP Silver with spouse Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|
|196753627115|TestHP|English|779800674|090990099|5|Testspouse|
Then Customer Registered successfully message is displayed

@hppostpaidregnew
Scenario: HP Gold with spouse Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|
|196753627116|TestHP|English|779907675|090990099|6|Testspouse|
Then Customer Registered successfully message is displayed

@hppostpaidregnewa
Scenario: HP Basic with child1 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|
|196726621315|TestHP|English|770947272|090990099|4|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidregnew
Scenario: HP Silver with child1 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|
|196726621316|TestHP|English|770669373|090990099|5|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidregnew
Scenario: HP Gold with child1 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|
|196753112317|TestHP|English|770227474|090990099|6|Testchild|
Then Customer Registered successfully message is displayed


@hpbasicwithSpouseCheck
Scenario: HP Basic with spouse,child1 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|
|196853119316|TestHP|English|770801176|770807766|4|Testspouse|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Silver with spouse,child1 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|
|196853676507|TestHP|English|770807777|770807767|5|Testspouse|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Gold with spouse,child1 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|
|196856721308|TestHP|English|770807778|770807768|6|Testspouse|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Basic with spouse,child1,child2 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|child2|
|196853678209|TestHP|English|770807888|770807888|4|Testspouse|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Silver with spouse,child1,child2 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|child2|
|196853666310|TestHP|English|770811176|770811166|5|Testspouse|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Gold with spouse,child1,child2 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|child2|
|196811121376|TestHP|English|770817776|770817766|6|Testspouse|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|child2|child3|
|196856631312|TestHP|English|770837776|090990099|4|Testspouse|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed


@hppostpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|child2|child3|
|196859941313|TestHP|English|770847070|090990099|5|Testspouse|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed


@hppostpaidregnew
Scenario: HP Gold with spouse,child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|spouse|child1|child2|child3|
|196853123314|TestHP|English|770857171|090990099|6|Testspouse|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed


@hppostpaidregister
Scenario: HP Basic with child1,child2 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|
|196853666118|TestHP|English|770811575|090990099|4|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Silver with child1,child2 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|
|196851278319|TestHP|English|770807676|090990099|5|Testchild|Testchild|
Then Customer Registered successfully message is displayed


@hppostpaidreg
Scenario: HP Gold with child1,child2 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|
|196853698720|TestHP|English|770801234|090990099|6|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Basic with child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|child3|
|196853629871|TestHP|English|770807878|090990099|4|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@hppostpaidreg
Scenario: HP Silver with child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|child3|
|196853621875|TestHP|English|770807979|090990099|5|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed


@hppostpaidreg
Scenario: HP Gold with child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|child3|
|196853621098|TestHP|English|770807171|090990099|6|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed


