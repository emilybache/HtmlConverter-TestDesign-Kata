package org.sammancoaching

import org.junit.jupiter.api.Test
import java.io.Reader
import java.io.StringReader
import kotlin.test.assertEquals


class HtmlConverterTest {

    @Test
    fun `convertToHtml uses valid html tags`() {
        val sr = StringReader("")
        val converter = HtmlConverter()
        val result = converter.convertToHtml(sr)
        assertEquals("<html></html>", result)
    }

    @Test
    fun `convertToHtml uses valid html tags with Stub`() {
        val sr: Reader = StubEmptyReader()
        val converter = HtmlConverter()
        val result = converter.convertToHtml(sr)
        assertEquals("<html></html>", result)
    }

    @Test
    fun `convertToHtml uses valid paragraph tags`() {
        val sr: Reader = StringReader("first line\n second line  \n")
        val converter = HtmlConverter()
        val result = converter.convertToHtml(sr)
        assertEquals("<html><p>first line</p><p>second line</p></html>", result)
    }

    @Test
    fun `convertToHtml uses valid paragraph tags with Stub`() {
        val sr: Reader = StubTwoLineReader()
        val converter = HtmlConverter()
        val result = converter.convertToHtml(sr)
        assertEquals("<html><p>first line</p><p>second line</p></html>", result)
    }

}


internal class StubEmptyReader : Reader() {

    public override fun read(cbuf: CharArray?, off: Int, len: Int): Int {
        return -1
    }


    public override fun close() {
    }
}

internal class StubTwoLineReader : Reader() {
    private var counter = -1

    public override fun read(cbuf: CharArray, off: Int, len: Int): Int {
        counter++
        var charCount = 0
        if (counter == 0) {
            val text = "first line\n"
            charCount = fillBuffer(cbuf, off, len, text)
        } else if (counter == 1) {
            val text = "  second line  \n"
            charCount = fillBuffer(cbuf, off, len, text)
        } else if (counter >= 2) {
            return -1
        }
        return charCount
    }

    public override fun close() {
    }

    companion object {
        private fun fillBuffer(cbuf: CharArray, off: Int, len: Int, text: String): Int {
            var charCount = 0
            for (i in off..<off + len) {
                if (text.length <= i) break
                cbuf[i] = text.get(i)
                charCount++
            }
            return charCount
        }
    }
}

