#include <gtest/gtest.h>

#include "UnicodeFileToHtmlTextConverter.h"

using namespace std;

TEST(HtmlConverter, Foo) {
    auto converter = new UnicodeFileToHtmlTextConverter("foo");
    ASSERT_EQ("fixme", converter->getFilename());
}