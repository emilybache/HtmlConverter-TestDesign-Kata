#include "ApprovalTests.hpp"
#include "doctest/doctest.h"
#include "HtmlTextConverter.h"


TEST_CASE ("HtmlTextConverter") {
    auto converter = new HtmlTextConverter("foo");
    REQUIRE("fixme" == converter->getFilename());
}


