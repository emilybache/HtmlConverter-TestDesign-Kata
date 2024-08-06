import Foundation

public class FileReader {
    let fileName: String

    public init(fileName: String) {
        self.fileName = fileName
    }

    public func readLines() -> [String] {
        guard let content = try? String(contentsOfFile: fileName, encoding: .utf8) else {
            return []
        }

        return content
            .components(separatedBy: .newlines)
    }
}
