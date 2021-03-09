Feature: Upgrade HP Level

@Silverupgrade
Scenario: HP Silver Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level and click on save button
|nic|newcover|
|856681726V|5|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with Spouse Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with spouse and click on save button
|nic|newcover|Spouse|
|197434403950|5|testspouse|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with Spouse and child1 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with spouse,child1 and click on save button
|nic|newcover|Spouse|child1|
|825321144v|5|testspouse|firstchild|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with Spouse,child1,child2 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with spouse,child1,child2 and click on save button
|nic|newcover|Spouse|child1|child2|
|925074195v|5|testspouse|firstchild|secondchild|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with Spouse,child1,child2,child3 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with spouse,child1,child2,child3 and click on save button
|nic         |newcover|Spouse    |child1    |child2     |child3    |
|607402221v|5       |testspouse|firstchild|secondchild|thirdchild|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with child1 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with child1 and click on save button
|nic|newcover|child1|
|665541681v|5|firstchild|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with child1,child2 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with child1,child2 and click on save button
|nic|newcover|child1|child2|
|878024664v|5|firstchild|secondchild|
Then Customer upgraded successfully message must be displayed

@Silverupgrade
Scenario: HP Silver with child1,child2,child3 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Silver level with child1,child2,child3 and click on save button
|nic         |newcover|child1    |child2     |child3    |
|825534350v|5       |firstchild|secondchild|thirdchild|
Then Customer upgraded successfully message must be displayed



@Goldupgrade
Scenario: HP Gold Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level and click on save button
|nic|newcover|
|197713203928|6|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with Spouse Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with spouse and click on save button
|nic|newcover|Spouse|
|732091548v|6|testspouse|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with Spouse,child1 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with spouse,child1 and click on save button
|nic|newcover|Spouse|child1|
|680140421V|6|testspouse|firstchild|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with Spouse,child1,child2 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with spouse,child1,child2 and click on save button
|nic|newcover|Spouse|child1|child2|
|198420402330|6|testspouse|firstchild|secondchild|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with Spouse,child1,child2,child3 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with spouse,child1,child2,child3 and click on save button
|nic         |newcover|Spouse    |child1    |child2     |child3    |
|196164802289|6       |testspouse|firstchild|secondchild|thirdchild|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with child1 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with child1 and click on save button
|nic|newcover|child1|
|572200868V|6|firstchild|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with child1,child2 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with child1,child2 and click on save button
|nic|newcover|child1|child2|
|198364000437|6|firstchild|secondchild|
Then Customer upgraded successfully message must be displayed

@Goldupgrade
Scenario: HP Gold with child1,child2,child3 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Gold level with child1,child2,child3 and click on save button
|nic         |newcover|child1    |child2     |child3    |
|613162836V|6       |firstchild|secondchild|thirdchild|
Then Customer upgraded successfully message must be displayed




@Basicupgrade
Scenario: HP Basic Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level and click on save button
|nic|newcover|
|728033339v|4|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with Spouse Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with spouse and click on save button
|nic|newcover|Spouse|
|728033339v|4|testspouse|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with Spouse,child1 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with spouse,child1 and click on save button
|nic|newcover|Spouse|child1|
|642800388V|4|testspouse|firstchild|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with Spouse,child1,child2 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with spouse,child1,child2 and click on save button
|nic|newcover|Spouse|child1|child2|
|726921806v|4|testspouse|firstchild|secondchild|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with Spouse,child1,child2,child3 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with spouse,child1,child2,child3 and click on save button
|nic         |newcover|Spouse    |child1    |child2     |child3    |
|670121518V|4       |testspouse|firstchild|secondchild|thirdchild|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with child1 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with child1 and click on save button
|nic|newcover|child1|
|670121518V|4|firstchild|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with child1,child2 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with child1,child2 and click on save button
|nic|newcover|child1|child2|
|866281319V|4|firstchild|secondchild|
Then Customer upgraded successfully message must be displayed

@Basicupgrade
Scenario: HP Basic with child1,child2,child3 Upgrade
Given User is on Upgrade HP Level menu under Customer Management
When User selects the HP Basic level with child1,child2,child3 and click on save button
|nic         |newcover|child1    |child2     |child3    |
|866281319V|4       |firstchild|secondchild|thirdchild|
Then Customer upgraded successfully message must be displayed


