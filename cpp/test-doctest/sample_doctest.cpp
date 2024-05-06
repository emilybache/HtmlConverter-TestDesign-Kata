#include "ApprovalTests.hpp"
#include "doctest/doctest.h"
#include "UnicodeFileToHtmlTextConverter.h"


TEST_CASE ("HtmlTextConverter") {
    auto converter = new UnicodeFileToHtmlTextConverter("foo");
    REQUIRE("fixme" == converter->getFilename());
}


TEST_CASE("HtmlTextConverter") {
    SUBCASE("convertToHtml uses valid html tags") {
        // TODO: write this test
    }
    SUBCASE("convertToHtml uses valid paragraph tags") {
        // TODO: write this test
    }
}

