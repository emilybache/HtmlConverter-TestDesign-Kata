import Foundation

public class HtmlPagesConverter {
    private var _fileName: String
    private var breaks: [Int] = []

    public var fileName: String { _fileName }
    
    public init(fileName: String) throws {
        self._fileName = fileName

        breaks.append(0)
        let lines = AppFileReader(fileName: fileName)
            .readLines()

        var cumulativeCount = 0
        for line in lines {
            cumulativeCount += line.count + 1 // Add one for newline
            if line.contains("PAGE_BREAK") {
                let pageBreakPosition = cumulativeCount
                breaks.append(pageBreakPosition)
            }
        }
    }

    func getHtmlPage(_ page: Int) throws -> String {
        let lines = AppFileReader(fileName: _fileName)
            .readLines()
        let pageBreak = breaks[page]
        var htmlPage = ""

        var offset = 0
        for line in lines {
            offset += line.count

            // Skip lines until we're at the page's first line index
            guard offset >= pageBreak else { continue }

            if line.contains("PAGE_BREAK") {
                break
            }

            htmlPage += HttpUtility.htmlEncode(line)
            htmlPage += "<br />"
        }

        return htmlPage
    }
}
