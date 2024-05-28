// The Swift Programming Language
// https://docs.swift.org/swift-book
// 
// Swift Argument Parser
// https://swiftpackageindex.com/apple/swift-argument-parser/documentation

import ArgumentParser

@main
struct Program: ParsableCommand {
    @Argument(help: "The file to convert")
    var fileName: String

    mutating func run() throws {
        do {
            let html = try HtmlConverter().convertToHtml(fileName)
            print(html)
        } catch {
            print("An error occurred while reading the file:", error)
        }
    }
}
