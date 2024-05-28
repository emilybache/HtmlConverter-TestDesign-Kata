// The Swift Programming Language
// https://docs.swift.org/swift-book
// 
// Swift Argument Parser
// https://swiftpackageindex.com/apple/swift-argument-parser/documentation

import ArgumentParser

@main
struct HtmlConverter: ParsableCommand {
    @Argument(help: "The file to convert")
    var fileName: String

    mutating func run() throws {
        print(fileName)
    }
}
