$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/loginTest.feature");
formatter.feature({
  "name": "To validate Newtours login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open \u003cBrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "And "
});
formatter.step({
  "name": "I Login inside application",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "qshore",
        "qshore123"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Result"
      ]
    },
    {
      "cells": [
        "Chrome",
        "success"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "NewtoursSteps.i_open_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "And "
});
formatter.match({
  "location": "NewtoursSteps.i_go_to_loginURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Login inside application",
  "rows": [
    {
      "cells": [
        "qshore",
        "qshore123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "NewtoursSteps.login_inside(String\u003e)"
});
formatter.result({
  "status": "passed"
});
});