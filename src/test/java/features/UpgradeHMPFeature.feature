Feature: Upgrade HMP Level

@1Mupgrade
Scenario: update HMP 1M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the CDMA,HMP 2M level and click on save button
|nic|newcover|
|910493906v|10|
Then Customer HMP upgraded successfully message must be displayed

@1Mupgrade
Scenario: update HMP 1M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the CDMA,HMP 5M level and click on save button
|nic|newcover|
|892401802v|11|
Then Customer HMP upgraded successfully message must be displayed


@2Mupgrade
Scenario: update HMP 2M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the CDMA,HMP 1M level and click on save button
|nic|newcover|
|910493906v|9|
Then Customer HMP upgraded successfully message must be displayed

@2Mupgrade
Scenario: update HMP 2M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the CDMA,HMP 5M level and click on save button
|nic|newcover|
|892401802v|11|
Then Customer HMP upgraded successfully message must be displayed


@5Mupgrade
Scenario: update HMP 5M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the CDMA,HMP 2M level and click on save button
|nic|newcover|
|199826536666|10|
Then Customer HMP upgraded successfully message must be displayed

@5Mupgrade
Scenario: update HMP 5M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the CDMA,HMP 1M level and click on save button
|nic|newcover|
|198725624241|9|
Then Customer HMP upgraded successfully message must be displayed


@LTEupgrade
Scenario: update HMP 1M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the LTE,HMP 2M level and click on save button
|nic|newcover|
|852422203V|10|
Then Customer HMP upgraded successfully message must be displayed

@LTEupgrade
Scenario: update HMP 1M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the LTE,HMP 5M level and click on save button
|nic|newcover|
|852422203V|11|
Then Customer HMP upgraded successfully message must be displayed


@LTEupgrade
Scenario: update HMP 2M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the LTE,HMP 1M level and click on save button
|nic|newcover|
|986361022v|9|
Then Customer HMP upgraded successfully message must be displayed

@LTEupgrade
Scenario: update HMP 2M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the LTE,HMP 5M level and click on save button
|nic|newcover|
|986361022v|11|
Then Customer HMP upgraded successfully message must be displayed


@LTEupgrade
Scenario: update HMP 5M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the LTE,HMP 2M level and click on save button
|nic|newcover|
|910493906v|10|
Then Customer HMP upgraded successfully message must be displayed

@LTEupgrade
Scenario: update HMP 5M level
Given User is on Upgrade HMP Level menu under Customer Management
When User selects the LTE,HMP 1M level and click on save button
|nic|newcover|
|910493906v|9|
Then Customer HMP upgraded successfully message must be displayed


