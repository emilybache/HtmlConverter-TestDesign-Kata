// The Swift Programming Language
// https://docs.swift.org/swift-book
// 
// Swift Argument Parser
// https://swiftpackageindex.com/apple/swift-argument-parser/documentation

import ArgumentParser

@main
struct Program: ParsableCommand {
    @Option(name: .shortAndLong, help: "The path to the file to convert")
    var fileName: String?

    mutating func run() throws {
        guard let path = fileName ?? askPathFromUserInput(), path != "" else {
            print("No path given, exiting.")
            return
        }

        do {
            let html = try HtmlConverter().convertToHtml(path)
            print(html)
        } catch {
            print("An error occurred while reading the file:", error)
        }
    }

    private func askPathFromUserInput() -> String? {
        print("Enter the file's full path you want to convert:")
        return readLine()
    }
}
