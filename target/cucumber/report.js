$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HPPostpaidRegisterCustomerFeature.feature");
formatter.feature({
  "line": 1,
  "name": "HP Postpaid Registration",
  "description": "",
  "id": "hp-postpaid-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 30058643692,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "HP Basic Postpaid Registration",
  "description": "",
  "id": "hp-postpaid-registration;hp-basic-postpaid-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on register customer menu under home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters all valid customer details,selects HP Basic postpaid product and clicks on Save button",
  "rows": [
    {
      "cells": [
        "NIC",
        "CustomerName",
        "PreferredLang",
        "msisdn",
        "AlternateContactnumber",
        "HPcover"
      ],
      "line": 7
    },
    {
      "cells": [
        "196753621942",
        "TestHP",
        "English",
        "770111778",
        "090990099",
        "4"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Customer Registered successfully message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GSMPostpaidRegisterCustomerSteps.user_is_on_register_customer_menu_under_home_page()"
});
formatter.result({
  "duration": 2339146309,
  "status": "passed"
});
formatter.match({
  "location": "GSMPostpaidRegisterCustomerSteps.user_enters_all_valid_customer_detailsselects_hp_basic_postpaid_product_and_clicks_on_save_button(DataTable)"
});
formatter.result({
  "duration": 3362895632,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027THBSLAPTOP-452\u0027, ip: \u002710.137.225.226\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.20 (c99e81631faa0..., userDataDir: C:\\Users\\KARTHI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55916}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e54ee74c8ab70a64efa615791ec7e60d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat pageObjects.GSMRegisterCustomerPageObject.enterHPalternatenumber(GSMRegisterCustomerPageObject.java:174)\r\n\tat stepDefinition.GSMPostpaidRegisterCustomerSteps.user_enters_all_valid_customer_detailsselects_hp_basic_postpaid_product_and_clicks_on_save_button(GSMPostpaidRegisterCustomerSteps.java:49)\r\n\tat ✽.When User enters all valid customer details,selects HP Basic postpaid product and clicks on Save button(HPPostpaidRegisterCustomerFeature.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GSMPostpaidRegisterCustomerSteps.customer_registered_successfully_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 720244402,
  "status": "passed"
});
formatter.before({
  "duration": 11002541382,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "HP Silver Postpaid Registration",
  "description": "",
  "id": "hp-postpaid-registration;hp-silver-postpaid-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on register customer menu under home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enters all valid customer details,selects HP Silver postpaid product and clicks on Save button",
  "rows": [
    {
      "cells": [
        "NIC",
        "CustomerName",
        "PreferredLang",
        "msisdn",
        "AlternateContactnumber",
        "HPcover"
      ],
      "line": 15
    },
    {
      "cells": [
        "196753627117",
        "TestHP",
        "English",
        "770111978",
        "090990099",
        "5"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Customer Registered successfully message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GSMPostpaidRegisterCustomerSteps.user_is_on_register_customer_menu_under_home_page()"
});
formatter.result({
  "duration": 1907867175,
  "status": "passed"
});
formatter.match({
  "location": "GSMPostpaidRegisterCustomerSteps.user_enters_all_valid_customer_detailsselects_hp_silver_postpaid_product_and_clicks_on_save_button(DataTable)"
});
formatter.result({
  "duration": 2713545771,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027THBSLAPTOP-452\u0027, ip: \u002710.137.225.226\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.20 (c99e81631faa0..., userDataDir: C:\\Users\\KARTHI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56016}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e575bd9ffdccf40e8687ba4f732b6e9a\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat pageObjects.GSMRegisterCustomerPageObject.enterHPalternatenumber(GSMRegisterCustomerPageObject.java:174)\r\n\tat stepDefinition.GSMPostpaidRegisterCustomerSteps.user_enters_all_valid_customer_detailsselects_hp_silver_postpaid_product_and_clicks_on_save_button(GSMPostpaidRegisterCustomerSteps.java:1001)\r\n\tat ✽.When User enters all valid customer details,selects HP Silver postpaid product and clicks on Save button(HPPostpaidRegisterCustomerFeature.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GSMPostpaidRegisterCustomerSteps.customer_registered_successfully_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 503065724,
  "status": "passed"
});
});