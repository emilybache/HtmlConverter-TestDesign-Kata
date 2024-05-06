#include "ApprovalTests.hpp"
#include "doctest/doctest.h"
#include "UnicodeFileToHtmlTextConverter.h"


TEST_CASE ("HtmlTextConverter") {
    auto converter = new UnicodeFileToHtmlTextConverter("foo");
    REQUIRE("fixme" == converter->getFilename());
}


