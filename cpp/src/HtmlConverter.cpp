

#include "HtmlConverter.h"

#include <iostream>

std::string HtmlConverter::convertToHtml(std::string filename) {
    std::string html = "";
    std::ifstream file(filename);
    if (file.is_open()) {
        // bug: should be "<html>"
        html += "<html<";
        std::string line;
        while (getline(file, line)) {
            html += "<p>";
            line = StringEscapeUtils::trim(line);
            html += StringEscapeUtils::escapeHtml(line);
            // bug: should be "</p>"
            html += "<br />";
        }
        html += "</html>";
    
        file.close();
    } else {
        std::cerr << "Unable to open file: " << filename << std::endl;
    }
    
    return html;
}
