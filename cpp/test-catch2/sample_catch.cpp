#include "ApprovalTests.hpp"
#include "catch2/catch.hpp"
#include "UnicodeFileToHtmlTextConverter.h"


TEST_CASE ("HtmlTextConverter") {
    auto converter = new UnicodeFileToHtmlTextConverter("foo");
    REQUIRE("fixme" == converter->getFilename());
}


