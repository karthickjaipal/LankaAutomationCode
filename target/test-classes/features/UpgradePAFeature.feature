Feature: Upgrade PA Level

@PAupgrade
Scenario: update PA 1M level
Given User is on Upgrade PA Level menu under Customer Management
When User selects the PA 1M level and click on save button
|nic|newcover|
|199826536666|18|
Then Customer PA upgraded successfully message must be displayed

@PAupgrade
Scenario: update PA 500K level
Given User is on Upgrade PA Level menu under Customer Management
When User selects the PA 500K level and click on save button
|nic|newcover|
|198725624241|17|
Then Customer PA upgraded successfully message must be displayed