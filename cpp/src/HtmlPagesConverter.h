

#ifndef HTMLCONVERTER_HTMLPAGESCONVERTER_H
#define HTMLCONVERTER_HTMLPAGESCONVERTER_H

#include <string>
#include <vector>
#include "string_escape_utils.h"

class HtmlPagesConverter {
    std::string m_filename;
    std::vector<int> m_breaks;

public:
    HtmlPagesConverter(std::string const& filename);

    std::string getHtmlPage(int page);

    std::string getFilename();
};


#endif //HTMLCONVERTER_HTMLPAGESCONVERTER_H
