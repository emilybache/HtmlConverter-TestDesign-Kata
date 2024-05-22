package org.sammancoaching;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;

public class HtmlConverterTest {

    @Test
    public void convertToHtml_UsesValidHtmlTags() {
        // TODO: write this test
    }

    @Test
    public void convertToHtml_UsesValidParagraphTags() {
        // TODO: write this test
    }
}


class StubTwoLineReader extends Reader {
    private int counter = -1;

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        counter++;
        var charCount = 0;
        if (counter == 0) {
            var text = "first line\n";
            charCount = fillBuffer(cbuf, off, len, text);
        }
        else if (counter == 1){
            var text = "  second line  \n";
            charCount = fillBuffer(cbuf, off, len, text);
        }
        else if (counter >= 2){
            return -1;
        }
        return charCount;
    }

    private static int fillBuffer(char[] cbuf, int off, int len, String text) {
        var charCount = 0;
        for (int i = off; i < off + len; i++) {
            if (text.length() <= i)
                break;
            cbuf[i] = text.charAt(i);
            charCount++;
        }
        return charCount;
    }

    @Override
    public void close() throws IOException {
    }
}

class StubEmptyReader extends Reader {

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return -1;
    }

    @Override
    public void close() throws IOException {
    }
}

