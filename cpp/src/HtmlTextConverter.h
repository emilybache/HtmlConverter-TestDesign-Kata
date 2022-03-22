

#ifndef HTMLCONVERTER_HTMLTEXTCONVERTER_H
#define HTMLCONVERTER_HTMLTEXTCONVERTER_H

#include <string>
#include <fstream>

#include "string_escape_utils.h"

class HtmlTextConverter
{
    std::string m_fullFilenameWithPath;

public:
    HtmlTextConverter(std::string const& fullFilenameWithPath);

    std::string convertToHtml();

    std::string getFilename();
};

#endif //HTMLCONVERTER_HTMLTEXTCONVERTER_H
