import HtmlConverter
import XCTest

final class HtmlConverterTests: XCTestCase {
    func test_convertToHtml_usesValidHtmlTags() {
        // TODO: write this test
    }

    func test_convertToHtml_usesValidParagraphTags() {
        // TODO: write this test
    }
}

fileprivate class StubTwoLinesFileReader: FileReader {
    func readLines() -> [String] {
        [
            "first line",
            "    second line"
        ]
    }
}

fileprivate class EmptyLinesFileReader: FileReader {
    func readLines() -> [String] {
        []
    }
}
