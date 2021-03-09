Feature: Deregister Customer


@SanitTes
Scenario: HP Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects the HP,clicks on Deregister button
|nic|
|198801116750|
Then  Deregister Success message is displayed

@SanityTes
Scenario: Life2017 Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects the Life,clicks on Deregister button
|nic|
|198806535703|
Then  Deregister Success message is displayed

@SanityTes
Scenario: PA2017 Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects the PA,clicks on Deregister button
|nic|
|198806535705|
Then  Deregister Success message is displayed

@SanityTest
Scenario: HP and PA2017 Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects HP and PA,clicks on Deregister button
|nic|
|199434233433|
Then  Deregister Success message is displayed

@SanityTest
Scenario: Life and PA2017 Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects Life and PA,clicks on Deregister button
|nic|
|199434233433|
Then  Deregister Success message is displayed

@SanityTest
Scenario: Life and HP Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects Life and HP,clicks on Deregister button
|nic|
|199434233433|
Then  Deregister Success message is displayed

@SanityTest
Scenario: Life, PA and HP Deregistration
Given User is on Deregister Customer menu under Home Page
When User enters nic and selects Life,PA and HP,clicks on Deregister button
|nic|
|199434233433|
Then  Deregister Success message is displayed

