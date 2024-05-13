package com.katas

import com.katas.StringEscapeUtils.Companion.escapeHtml
import java.io.BufferedReader
import java.io.FileReader

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
            html.append(escapeHtml(line))
            // bug: should be "</p>"
            html.append("<br />")
            line = reader.readLine()
        }
        html.append("</html>")
        return html.toString()
    }
}
