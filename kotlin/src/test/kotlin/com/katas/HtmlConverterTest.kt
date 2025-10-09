package com.katas

import org.junit.jupiter.api.Test
import java.io.Reader


class HtmlConverterTest {
    @Test
    fun `convertToHtml uses valid html tags`() {
        // TODO: write this test
    }

    @Test
    fun `convertToHtml uses valid paragraph tags`() {
        // TODO: write this test
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

