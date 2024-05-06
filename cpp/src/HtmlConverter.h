

#ifndef HTMLCONVERTER_HTMLCONVERTER_H
#define HTMLCONVERTER_HTMLCONVERTER_H

#include <string>
#include <fstream>

#include "string_escape_utils.h"

class HtmlConverter {
public:
    std::string convertToHtml(std::string filename);

};


#endif //HTMLCONVERTER_HTMLCONVERTER_H
