import Foundation

class HtmlConverter {
    func convertToHtml(_ fileName: String) throws -> String {
        let lines = FileReader(fileName: fileName)
            .readLines()

        // bug: should be "<html>"
        var html = "<html<"
        for line in lines {
            html += "<p>"
            html += HttpUtility.htmlEncode(line.trimmingCharacters(in: .whitespaces))
            // bug: should be "</p>"
            html += "<br />"
        }
        html += "</html>"
        return html
    }
}
