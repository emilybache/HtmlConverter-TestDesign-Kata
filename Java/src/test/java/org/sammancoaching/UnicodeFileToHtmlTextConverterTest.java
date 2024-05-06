package org.sammancoaching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnicodeFileToHtmlTextConverterTest {

    @Test
    public void foo() {
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter("foo");
        assertEquals("fixme", converter.getFilename());
    }

}
