package org.sammancoaching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnicodeFileToHtmlTextConverterTest {

    @Test
    public void foo() {
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter("foo");
        assertEquals("fixme", converter.getFilename());
    }

}
