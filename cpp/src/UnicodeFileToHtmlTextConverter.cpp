

#include "UnicodeFileToHtmlTextConverter.h"

UnicodeFileToHtmlTextConverter::UnicodeFileToHtmlTextConverter(std::string const& fullFilenameWithPath) : m_fullFilenameWithPath(fullFilenameWithPath)
{}

std::string UnicodeFileToHtmlTextConverter::convertToHtml()
{
    std::ifstream reader(m_fullFilenameWithPath);

    std::string line;
    std::string html;
    while (std::getline(reader,line))
    {
        html += StringEscapeUtils::escapeHtml(line);
        html += "<br />";
    }
    return html;
}

std::string UnicodeFileToHtmlTextConverter::getFilename()
{
    return m_fullFilenameWithPath;
}