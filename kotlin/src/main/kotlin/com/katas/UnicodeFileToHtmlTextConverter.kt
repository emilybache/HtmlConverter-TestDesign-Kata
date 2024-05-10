package com.katas

import java.io.BufferedReader
import java.io.FileReader

class UnicodeFileToHtmlTextConverter(
    val filename: String
) {

    fun convertToHtml(): String {
        val reader = BufferedReader(FileReader(filename))

        var line = reader.readLine()
        var html = ""
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line)
            html += "<br />"
            line = reader.readLine()
        }
        return html
    }
}
