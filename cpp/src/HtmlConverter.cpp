

#include "HtmlConverter.h"

std::string HtmlConverter::convertToHtml(std::string filename) {
    std::ifstream reader(filename);

    std::string line;

    // bug: should be "<html>"
    std::string html = "<html<";
    while (std::getline(reader,line))
    {
        html += "<p>";
        line = StringEscapeUtils::trim(line);
        html += StringEscapeUtils::escapeHtml(line);
        // bug: should be "</p>"
        html += "<br />";
    }
    html += "</html>";
    return html;
}
