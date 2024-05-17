package org.sammancoaching;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class HtmlConverterTest {

    @Test
    public void convertToHtml_UsesValidHtmlTags() throws IOException {
        StringReader sr = new StringReader("");
        HtmlConverter converter = new HtmlConverter();
        var result = converter.convertToHtml(sr);
        assertEquals("<html></html>", result);
    }

    @Test
    public void convertToHtml_UsesValidHtmlTags_withStub() throws IOException {
        Reader sr = new StubEmptyReader();
        HtmlConverter converter = new HtmlConverter();
        var result = converter.convertToHtml(sr);
        assertEquals("<html></html>", result);
    }

    @Test
    public void convertToHtml_UsesValidParagraphTags() throws IOException {
        Reader sr = new StringReader("first line\n second line  \n");
        HtmlConverter converter = new HtmlConverter();
        var result = converter.convertToHtml(sr);
        assertEquals("<html><p>first line</p><p>second line</p></html>", result);
    }

    @Test
    public void convertToHtml_UsesValidParagraphTags_withStub() throws IOException {
        Reader sr = new StubTwoLineReader();
        HtmlConverter converter = new HtmlConverter();
        var result = converter.convertToHtml(sr);
        assertEquals("<html><p>first line</p><p>second line</p></html>", result);
    }
}
