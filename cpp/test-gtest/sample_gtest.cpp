#include <gtest/gtest.h>

#include "HtmlTextConverter.h"

using namespace std;

TEST(HtmlConverter, Foo) {
    auto converter = new HtmlTextConverter("foo");
    ASSERT_EQ("fixme", converter->getFilename());
}