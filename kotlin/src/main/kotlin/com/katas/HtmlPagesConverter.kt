package com.katas

import java.io.BufferedReader
import java.io.FileReader

class HtmlPagesConverter(
    val filename: String
) {
    private val breaks: MutableList<Int> = ArrayList()

    init {
        breaks.add(0)
        val reader = BufferedReader(FileReader(filename))
        var cumulativeCharCount = 0
        var line = reader.readLine()
        while (line != null) {
            cumulativeCharCount += line.length + 1 // add one for the newline
            if (line.contains("PAGE_BREAK")) {
                val page_break_position = cumulativeCharCount
                breaks.add(page_break_position)
            }
            line = reader.readLine()
        }
        reader.close()
    }

    fun getHtmlPage(page: Int): String {
        val reader = BufferedReader(FileReader(this.filename))
        reader.skip(breaks[page].toLong())
        val htmlPage = StringBuffer()
        var line = reader.readLine()
        while (line != null) {
            if (line.contains("PAGE_BREAK")) {
                break
            }
            htmlPage.append(StringEscapeUtils.escapeHtml(line))
            htmlPage.append("<br />")

            line = reader.readLine()
        }
        reader.close()
        return htmlPage.toString()
    }
}
