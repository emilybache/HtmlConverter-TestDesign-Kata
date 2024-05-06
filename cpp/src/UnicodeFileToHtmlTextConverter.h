

#ifndef HTMLCONVERTER_UNICODEFILETOHTMLTEXTCONVERTER_H
#define HTMLCONVERTER_UNICODEFILETOHTMLTEXTCONVERTER_H

#include <string>
#include <fstream>

#include "string_escape_utils.h"

class UnicodeFileToHtmlTextConverter
{
    std::string m_fullFilenameWithPath;

public:
    UnicodeFileToHtmlTextConverter(std::string const& fullFilenameWithPath);

    std::string convertToHtml();

    std::string getFilename();
};

#endif //HTMLCONVERTER_UNICODEFILETOHTMLTEXTCONVERTER_H
