#include "ApprovalTests.hpp"
#include "catch2/catch.hpp"
#include "HtmlTextConverter.h"


TEST_CASE ("HtmlTextConverter") {
    auto converter = new HtmlTextConverter("foo");
    REQUIRE("fixme" == converter->getFilename());
}


