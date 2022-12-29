$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CarsGuide.feature");
formatter.feature({
  "line": 2,
  "name": "Search Car Function",
  "description": "",
  "id": "search-car-function",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search-car"
    }
  ]
});
formatter.before({
  "duration": 3053690500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify search car functionality in carsguide website",
  "description": "",
  "id": "search-car-function;verify-search-car-functionality-in-carsguide-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the Home Page \"https://www.carsguide.com.au/\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I move to Car For Sale Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 7
    },
    {
      "cells": [
        "Cars For Sale"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select location as \"NSW - Newcastle\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select \"$1,000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale Newcastle NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 23
    }
  ],
  "location": "SearchCarStepDef.i_am_on_the_Home_Page_of_CarsGuide_Website(String)"
});
formatter.result({
  "duration": 14733142800,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepDef.i_move_to_Car_For_Sale_Menu(String\u003e)"
});
formatter.result({
  "duration": 296852100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarStepDef.click_on_link(String)"
});
formatter.result({
  "duration": 728733500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCarStepDef.select_carbrand_as_from_AnyMake_dropdown(String)"
});
formatter.result({
  "duration": 3621135600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "SearchCarStepDef.select_as_car_model(String)"
});
formatter.result({
  "duration": 737739300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Newcastle",
      "offset": 20
    }
  ],
  "location": "SearchCarStepDef.select_location_as_from_SelectLocation_dropdown(String)"
});
formatter.result({
  "duration": 511695200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 8
    }
  ],
  "location": "SearchCarStepDef.select_as_price(String)"
});
formatter.result({
  "duration": 482186100,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepDef.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 5325343800,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarStepDef.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 8706400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for Sale Newcastle NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarStepDef.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 203438100,
  "status": "passed"
});
formatter.after({
  "duration": 970550700,
  "status": "passed"
});
formatter.uri("UsedCarSaleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that \r\nthe Used Search Cars page is working\r\nPerforming the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Used-Car-Search"
    }
  ]
});
formatter.before({
  "duration": 2163029000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate Used  Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-used--search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Used-Car-SearchPositive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to the  Home Page \"https://www.carsguide.com.au\" of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to Car-For-Sale Menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on submenu Used Cars Search link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select carMaker from AnyMake dropdown",
  "rows": [
    {
      "cells": [
        "carMaker"
      ],
      "line": 13
    },
    {
      "cells": [
        "Audi"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select  car model",
  "rows": [
    {
      "cells": [
        "carModel"
      ],
      "line": 16
    },
    {
      "cells": [
        "A4"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select location  from SelectLocation dropdown",
  "rows": [
    {
      "cells": [
        "location"
      ],
      "line": 19
    },
    {
      "cells": [
        "SA - All"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select price from the below list",
  "rows": [
    {
      "cells": [
        "price"
      ],
      "line": 22
    },
    {
      "cells": [
        "$1,000"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on Find_My_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see list of Used cars",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the page title should match expected title  \"Used Audi A4 Under 1000 for Sale SA - Second Hand Audi A4 Under $1k in SA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 30
    }
  ],
  "location": "UsedCarSearchPageStepDef.i_navigate_to_the_Home_Page_of_CarsGuide_Website(String)"
});
formatter.result({
  "duration": 10938495900,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.i_move_to_Car_For_Sale_Menu()"
});
formatter.result({
  "duration": 380764100,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.click_on_submenu_Used_Cars_Search_link()"
});
formatter.result({
  "duration": 499929800,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.select_carMaker_from_AnyMake_dropdown(String\u003e)"
});
formatter.result({
  "duration": 4692156400,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.select_car_model(String\u003e)"
});
formatter.result({
  "duration": 587871500,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.select_location_from_SelectLocation_dropdown(String\u003e)"
});
formatter.result({
  "duration": 416754000,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.select_price_from_the_below_list(String\u003e)"
});
formatter.result({
  "duration": 457375700,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.click_on_Find_My_Car_button()"
});
formatter.result({
  "duration": 4842900500,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchPageStepDef.i_should_see_list_of_Used_cars()"
});
formatter.result({
  "duration": 11182100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 1000 for Sale SA - Second Hand Audi A4 Under $1k in SA | carsguide",
      "offset": 45
    }
  ],
  "location": "UsedCarSearchPageStepDef.the_page_title_should_match_expected_title(String)"
});
formatter.result({
  "duration": 384894700,
  "status": "passed"
});
formatter.after({
  "duration": 988348900,
  "status": "passed"
});
});