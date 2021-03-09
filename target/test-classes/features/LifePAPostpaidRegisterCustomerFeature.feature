Feature: Life and PA Postpaid Registration

@lifepostpaidreg
Scenario: Life2017 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198102335322|TestLife|English|772890101|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepostpaidreg
Scenario: Life2017 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198102335323|TestLife|English|772890102|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepostpaidreg
Scenario: Life2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198102335324|TestLife|English|772890123|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepostpaidreg
Scenario: Life2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|198106535724|TestLife|English|772890104|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@papostpaidreg
Scenario: PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|197106535745|TestPA|English|772890105|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed

@papostpaidreg
Scenario: PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|197106535746|TestPA|English|772890106|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 100K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535731|TestHP|English|012890111|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 250K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535732|TestHP|English|012890112|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 500K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535733|TestHP|English|012890213|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 1M and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535734|TestHP|English|012890114|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 100K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535735|TestHP|English|012891215|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 250K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535736|TestHP|English|012890116|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 500K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535737|TestHP|English|012823117|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@lifepapostpaidreg
Scenario: Life 1M and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535738|TestHP|English|012890118|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@hpbasiclifepostpaidreg
Scenario: HP Basic and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|197106535727|TestHP|English|772890107|090990099|4|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@hpbasiclifepostpaidreg
Scenario: HP Basic and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|197106535728|TestHP|English|772890108|090990099|4|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@hpbasiclifepostpaidreg
Scenario: HP Basic and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|772890109|090990099|4|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@hpbasiclifepostpaidreg
Scenario: HP Basic and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|772890110|090990099|4|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed










@allpostpaidreg
Scenario: Life 100K HP Basic PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|772890119|090990099|4|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535721|TestLife|English|012890101|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535722|TestLife|English|012890102|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535723|TestLife|English|012890123|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535724|TestLife|English|012890104|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535725|TestPA|English|012890105|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535726|TestPA|English|012890106|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535731|TestHP|English|012890111|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535732|TestHP|English|012890112|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535733|TestHP|English|012890213|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535734|TestHP|English|012890114|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535735|TestHP|English|012891215|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535736|TestHP|English|012890116|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535737|TestHP|English|012823117|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535738|TestHP|English|012890118|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535721|TestLife|English|012890101|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535722|TestLife|English|012890102|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535723|TestLife|English|012890123|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535724|TestLife|English|012890104|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535725|TestPA|English|012890105|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535726|TestPA|English|012890106|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535731|TestHP|English|012890111|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535732|TestHP|English|012890112|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535733|TestHP|English|012890213|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M and PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535734|TestHP|English|012890114|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535735|TestHP|English|012891215|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535736|TestHP|English|012890116|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535737|TestHP|English|012823117|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M and PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535738|TestHP|English|012890118|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testspouse|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testspouse|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testspouse|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testspouse|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testspouse|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testspouse|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testspouse|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testspouse|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testspouse|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testspouse|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testspouse|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testspouse|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testspouse|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testspouse|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Silver with spouse and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testspouse|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testspouse|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testspouse|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testspouse|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testspouse|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testspouse|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testspouse|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testspouse|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testspouse|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testspouse|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testspouse|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testspouse|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testspouse|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testspouse|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@hpbasicwithSpouseCheck1
Scenario: HP Basic with spouse and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testspouse|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testspouse|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testspouse|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testspouse|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testspouse|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testspouse|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testspouse|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testspouse|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testspouse|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testspouse|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testspouse|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testspouse|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testspouse|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testspouse|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Gold with spouse,child1 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testspouse|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testspouse|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testspouse|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testspouse|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testspouse|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testspouse|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testspouse|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testspouse|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testspouse|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testspouse|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testspouse|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testspouse|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testspouse|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testspouse|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Silver with spouse,child1 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testspouse|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testspouse|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testspouse|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testspouse|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testspouse|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testspouse|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testspouse|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testspouse|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testspouse|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testspouse|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testspouse|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testspouse|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testspouse|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testspouse|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Basic with spouse,child1 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testspouse|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testspouse|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testspouse|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testspouse|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testspouse|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testspouse|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testspouse|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testspouse|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testspouse|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testspouse|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testspouse|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testspouse|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testspouse|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testspouse|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Gold with spouse,child1,child2 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testspouse|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testspouse|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testspouse|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testspouse|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testspouse|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testspouse|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testspouse|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testspouse|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testspouse|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testspouse|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testspouse|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testspouse|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testspouse|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testspouse|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Silver with spouse,child1,child2 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testspouse|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1,child2 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testspouse|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1,child2 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testspouse|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1,child2 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testspouse|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testspouse|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testspouse|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testspouse|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testspouse|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testspouse|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testspouse|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testspouse|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testspouse|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testspouse|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testspouse|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Basic with spouse,child1,child2 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testspouse|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1,child2 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testspouse|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1,child2 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testspouse|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1,child2 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testspouse|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testspouse|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testspouse|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testspouse|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testspouse|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testspouse|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testspouse|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testspouse|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testspouse|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testspouse|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testspouse|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2,child3 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2,child3 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2,child3 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with spouse,child1,child2,child3 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with spouse,child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testspouse|Testchild|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with spouse,child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testspouse|Testchild|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with spouse,child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with spouse,child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|spouse|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testspouse|Testchild|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed




@postpaidreg
Scenario: HP Silver with child1,child2,child3 Postpaid Registration
Given User is on register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|AlternateContactnumber|HPcover|child1|child2|child3|
|199906535720|TestHP|English|012890100|090990099|5|Testchild|Testchild|Testchild|
Then Customer Registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2,child3 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testchild|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2,child3 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testchild|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2,child3 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testchild|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2,child3 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testchild|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testchild|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testchild|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testchild|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testchild|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testchild|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testchild|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testchild|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testchild|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testchild|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testchild|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed




@postpaidreg
Scenario: HP Basic with child1,child2,child3 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testchild|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1,child2,child3 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testchild|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1,child2,child3 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testchild|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1,child2,child3 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testchild|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testchild|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testchild|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testchild|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testchild|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testchild|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testchild|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testchild|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testchild|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testchild|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testchild|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Gold with child1,child2,child3 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testchild|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1,child2,child3 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testchild|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1,child2,child3 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testchild|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1,child2,child3 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testchild|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testchild|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testchild|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testchild|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testchild|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testchild|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testchild|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testchild|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testchild|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with child1,child2,child3 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testchild|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with child1,child2,child3 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,child3 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|child3|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testchild|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Gold with child1,child2 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1,child2 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1,child2 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1,child2 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,child2 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1,child2 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1,child2 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,child2 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Basic with child1,child2 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testchild|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1,child2 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testchild|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1,child2 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testchild|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1,child2 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testchild|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testchild|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testchild|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testchild|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testchild|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testchild|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testchild|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testchild|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testchild|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with child1,child2 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testchild|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with child1,child2 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,child2 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|child2|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testchild|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



@postpaidreg
Scenario: HP Gold with child1 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|6|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|6|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|6|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Gold with child1 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|6|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Gold with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|6|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|6|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|6|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|6|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Gold with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|6|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Gold with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|6|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Gold with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|6|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Gold with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|6|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|6|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Gold with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Gold with child1 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|6|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|5|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|5|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|5|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Silver with child1 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|5|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Silver with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|5|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|5|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|5|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|5|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Silver with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|5|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Silver with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|5|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Silver with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|5|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Silver with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|5|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|5|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Silver with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Silver with child1 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|5|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1 and Life 100K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 and Life 100K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535727|TestHP|English|012890107|090990099|4|Testchild|090990099|13|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1 and Life 250K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 and Life 250K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535728|TestHP|English|012890108|090990099|4|Testchild|090990099|14|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1 and Life 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 and Life 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535729|TestHP|English|012890109|090990099|4|Testchild|090990099|15|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: HP Basic with child1 and Life 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 and Life 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535730|TestHP|English|012890110|090990099|4|Testchild|090990099|16|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: Life 100K HP Basic with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 100K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535739|TestHP|English|012890119|090990099|4|Testchild|090990099|13|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 250K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535740|TestHP|English|012890200|090990099|4|Testchild|090990099|14|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 500K and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535741|TestHP|English|012890201|090990099|4|Testchild|090990099|15|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 1M and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535742|TestHP|English|012890202|090990099|4|Testchild|090990099|16|090990099|17|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 100K HP Basic with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 100K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535743|TestHP|English|012890203|090990099|4|Testchild|090990099|13|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 250K HP Basic with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 250K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535744|TestHP|English|012890204|090990099|4|Testchild|090990099|14|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 500K HP Basic with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 500K and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535745|TestHP|English|012890205|090990099|4|Testchild|090990099|15|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed

@postpaidreg
Scenario: Life 1M HP Basic with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1,Life 1M and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|LifeAlternateContactnumber|Lifecover|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|Nominee_relation|
|199906535746|TestHP|English|012890206|090990099|4|Testchild|090990099|16|090990099|18|Testnominee|090990099|Spouse|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with child1 PA2017 500K Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 and PA2017 500K postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535747|TestHP|English|012890207|090990099|4|Testchild|090990099|17|Testnominee|090990099|
Then Customer registered successfully message is displayed


@postpaidreg
Scenario: HP Basic with child1 PA2017 1M Postpaid Registration
Given User is on Register customer menu under home page
When User enters all valid customer details,selects HP Basic with child1 and PA2017 1M postpaid product and clicks on Save button
|NIC|CustomerName|PreferredLang|msisdn|HPAlternateContactnumber|HPcover|child1|PAAlternateContactnumber|PAcover|Nominee_name|Nominee_msisdn|
|199906535748|TestHP|English|012890208|090990099|4|Testchild|090990099|18|Testnominee|090990099|
Then Customer registered successfully message is displayed



