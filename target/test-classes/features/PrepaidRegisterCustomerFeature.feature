Feature: Prepaid Registration

@prepaidre
Scenario: HP Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|
|198801116750|TestHP|English|991770100|990990099|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life2017 100K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535701|TestLife|English|998700120|990990099|13|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life2017 250K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199886535702|TestLife|English|990880102|990990099|14|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535703|TestLife|English|990880103|990990099|15|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535704|TestLife|English|990880104|990990099|16|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|198806535705|TestPA|English|990880105|990990099|17|Testnominee|990990099|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|198806535706|TestPA|English|990880106|990990099|18|Testnominee|990990099|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: HP and Life 100K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP and Life 100K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535707|TestHP|English|990880121|990990099|990990099|13|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: HP and Life 250K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP and Life 250K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535708|TestHP|English|990880108|990990099|990990099|14|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: HP and Life 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP and Life 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535709|TestHP|English|990880109|990990099|990990099|15|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: HP and Life 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP and Life 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535710|TestHP|English|990880110|990990099|990990099|16|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life 100K and PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535711|TestHP|English|990880111|990990099|13|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life 250K and PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535712|TestHP|English|990880112|990990099|14|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life 500K and PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535713|TestHP|English|990880113|990990099|15|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidre
Scenario: Life 1M and PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198806535714|TestHP|English|990880114|990990099|16|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 100K and PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535715|TestHP|English|990880115|990990099|13|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 250K and PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535716|TestHP|English|990880122|990990099|14|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 500K and PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535717|TestHP|English|990880117|990990099|15|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 1M and PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535718|TestHP|English|990880118|990990099|16|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed


@prepaidreg
Scenario: Life 100K HP PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 100K and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|13|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 250K HP PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 250K and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|14|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 500K HP PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 500K and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|15|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 1M HP PA2017 500K Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 1M and PA2017 500K product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|16|990990099|17|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 100K HP PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 100K and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|13|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 250K HP PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 250K and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|14|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 500K HP PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 500K and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|15|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed

@prepaidreg
Scenario: Life 1M HP PA2017 1M Prepaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP,Life 1M and PA2017 1M product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199306535719|TestHP|English|990880119|990990099|990990099|16|990990099|18|Testnominee|990990099|Spouse|
Then Customer registered successfully message is displayed



