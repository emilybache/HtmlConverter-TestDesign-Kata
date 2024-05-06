#include <gtest/gtest.h>

#include "UnicodeFileToHtmlTextConverter.h"
#include "HtmlConverter.h"

using namespace std;

TEST(UnicodeFileToHtmlTextConverter, Foo) {
    auto converter = new UnicodeFileToHtmlTextConverter("foo");
    ASSERT_EQ("fixme", converter->getFilename());
}

TEST(HtmlConverter, convertToHtml_UsesValidHtmlTags) {
    // TODO: write this test
}

TEST(HtmlConverter, convertToHtml_UsesValidParagraphTags) {
    // TODO: write this test
}
