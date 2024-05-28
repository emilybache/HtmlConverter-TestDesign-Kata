import Foundation

class UnicodeFileToHtmlTextConverter {
    private let _fullFilenameWithPath: String

    init(fullFilenameWithPath: String) {
        self._fullFilenameWithPath = fullFilenameWithPath
    }

    func getFileName() -> String {
        _fullFilenameWithPath
    }

    func convertToHtml() throws -> String {
        let content = try String(contentsOfFile: _fullFilenameWithPath, encoding: .unicode)
        let lines = content.components(separatedBy: .newlines)

        var html = ""
        for line in lines {
            html += HttpUtility.htmlEncode(line.trimmingCharacters(in: .whitespaces))
            html += "<br />"
        }
        html += "</html>"

        return html
    }
}
