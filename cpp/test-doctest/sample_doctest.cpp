#include "ApprovalTests.hpp"
#include "doctest/doctest.h"
#include "UnicodeFileToHtmlTextConverter.h"
#include "HtmlPagesConverter.h"


TEST_CASE ("UnicodeFileToHtmlTextConverter") {
    // TODO: Write a better test
//    auto converter = new UnicodeFileToHtmlTextConverter("foo");
//    REQUIRE("fixme" == converter->getFilename());
}
TEST_CASE ("HtmlPagesConverter") {
    // TODO: Write a better test
//    auto converter = new HtmlPagesConverter("foo");
//    REQUIRE("fixme" == converter->getFilename());
}


TEST_CASE("HtmlTextConverter") {
    SUBCASE("convertToHtml uses valid html tags") {
        // TODO: write this test
    }
    SUBCASE("convertToHtml uses valid paragraph tags") {
        // TODO: write this test
    }
}

