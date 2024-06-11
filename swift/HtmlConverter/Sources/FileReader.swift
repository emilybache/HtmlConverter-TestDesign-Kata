import Foundation

public protocol FileReader {
    func readLines() -> [String]
}

public class AppFileReader: FileReader {
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
