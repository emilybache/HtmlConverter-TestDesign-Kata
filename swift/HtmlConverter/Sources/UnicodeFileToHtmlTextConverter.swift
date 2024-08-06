import Foundation

public class UnicodeFileToHtmlTextConverter {
    private let _fullFilenameWithPath: String

    public var fileName: String { _fullFilenameWithPath }

    public init(_ fullFilenameWithPath: String) {
        self._fullFilenameWithPath = fullFilenameWithPath
    }

    func convertToHtml() throws -> String {
        let lines = FileReader(fileName: _fullFilenameWithPath)
            .readLines()

        var html = ""
        for line in lines {
            html += HttpUtility.htmlEncode(line.trimmingCharacters(in: .whitespaces))
            html += "<br />"
        }
        html += "</html>"

        return html
    }
}
