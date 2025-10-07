package org.sammancoaching

import java.io.BufferedReader
import java.io.FileReader
import kotlin.system.exitProcess

class HtmlConverter {

    fun convertToHtml(filename: String): String {
        val fileReader = FileReader(filename)
        val reader = BufferedReader(fileReader)
        var line = reader.readLine()
        // bug: should be "<html>"
        val html = StringBuilder("<html<")
        while (line != null) {
            html.append("<p>")
            line = line.trim { it <= ' ' }
            html.append(StringEscapeUtils.Companion.escapeHtml(line))
            // bug: should be "</p>"
            html.append("<br />")
            line = reader.readLine()
        }
        html.append("</html>")
        return html.toString()
    }


    fun main(args: Array<String?>) {
        if (args.size != 1) {
            System.err.println("Usage: kotlin HtmlConverter <filename>")
            exitProcess(1)
        }
        val converter = HtmlConverter()
        print(converter.convertToHtml(args[0]!!))
    }
}
